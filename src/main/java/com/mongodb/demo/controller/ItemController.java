package com.mongodb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.demo.model.Item;
import com.mongodb.demo.service.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /* LIST */
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    /* CREATE */
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    /* UPDATE */
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable String id, @RequestBody Item item) {
        item.setId(id);
        return itemService.saveItem(item);
    }

    /* DELETE */

    /* SEARCH */
    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String name) {
        return List.of(); // FIXME
    }
}