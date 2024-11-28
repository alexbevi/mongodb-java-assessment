const apiUrl = '/api/items';

document.getElementById('itemForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const id = document.getElementById('itemId').value;
    const item = {
        name: document.getElementById('itemName').value,
        description: document.getElementById('itemDescription').value
    };

    if (id) {
        updateItem(id, item);
    } else {
        createItem(item);
    }
});

async function createItem(item) {
    await fetch(apiUrl, {
        method: 'POST',
        body: JSON.stringify(item),
        headers: {
            'Content-Type': 'application/json'
        }
    });
    resetForm();
    loadItems();
}

async function updateItem(id, item) {
    await fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        body: JSON.stringify(item),
        headers: {
            'Content-Type': 'application/json'
        }
    });
    resetForm();
    loadItems();
}

async function loadItems() {
    const response = await fetch(apiUrl);
    const items = await response.json();
    const itemList = document.getElementById('itemList');
    itemList.innerHTML = '';
    items.forEach(item => {
        const li = document.createElement('li');
        console.log(item.name);
        li.textContent = `${item.name} - ${item.description}`;
        li.onclick = () => editItem(item);
        itemList.appendChild(li);
    });
}

function editItem(item) {
    document.getElementById('itemId').value = item.id;
    document.getElementById('itemName').value = item.name;
    document.getElementById('itemDescription').value = item.description;
}

function resetForm() {
    document.getElementById('itemForm').reset();
    document.getElementById('itemId').value = '';
}

async function filterItems() {
    const name = document.getElementById('filter').value;
    const response = await fetch(`${apiUrl}/search?name=${name}`);
    const items = await response.json();
    const itemList = document.getElementById('itemList');
    itemList.innerHTML = '';
    items.forEach(item => {
        const li = document.createElement('li');
        li.textContent = `${item.name} - ${item.description}`;
        li.onclick = () => editItem(item);
        itemList.appendChild(li);
    });
}

document.addEventListener('DOMContentLoaded', loadItems);