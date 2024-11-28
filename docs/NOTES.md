**Update Connection String**

`src/main/resources/application.properties` needs to be updated:
```yml
# either the connection string
spring.data.mongodb.uri=mongodb+srv://user:password@cluster0.abcde.mongodb.net/spring
# or an environment variable reference
spring.data.mongodb.uri=${ATLAS_URI}
```

Note the connection string would need to have the database included, or a `spring.data.mongodb.database` entry defined.

**Setup `Item` Model**

Either setup manual getters/setters or use Lombok annotations (ex: `@Data`)

**Making Search Functionality Work**

First fill out the logic in the `ItemController` for searching:
```java
@GetMapping("/search")
public List<Item> searchItems(@RequestParam String name) {
    return itemService.findByName(name);
}
```

The service would also be missing the associated call, which would need to be created:
```java
public List<Item> findByName(String name) {
    return itemRepository.findByNameContaining(name);
}
```

Note the `findByNameContaining` repository method will already be defined. A candidate should be able to identify that there's a proxy method on the repository they would need to use for the search functionality from the service.

**List all items using the API**

Just navigating to http://localhost:8080/api/items will return all results, but this URL can be cURL'ed as well.

**Deleting an Item by Id using the API**

First, update the `ItemController` with a delete mapping:
```java
@DeleteMapping("/{id}")
public void deleteItem(@PathVariable String id) {
    itemService.deleteItem(id);
}
```

Next update the `ItemService` with an associated delete method:
```java
public void deleteItem(String id) {
    itemRepository.deleteById(id);
}
```

You can then use something like Postman or cURL to delete an item by id:
```bash
curl -X DELETE localhost:8080/api/items/6748c1984a166e3ebf92162f
```

**Run the application**

```bash
mvn spring-boot:run
```