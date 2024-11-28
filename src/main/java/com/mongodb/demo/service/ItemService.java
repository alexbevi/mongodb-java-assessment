package com.mongodb.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.demo.model.Item;
import com.mongodb.demo.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(String id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}