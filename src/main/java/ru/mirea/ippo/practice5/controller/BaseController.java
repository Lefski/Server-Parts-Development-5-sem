package ru.mirea.ippo.practice5.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.mirea.ippo.practice5.service.Base;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
public class BaseController<ITEM, ID extends Serializable, SERVICE extends Base<ITEM, ID>> {

    protected final SERVICE service;

    @GetMapping()
    ResponseEntity<List<ITEM>> getAllItems() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{itemId}")
    ResponseEntity<ITEM> getItem(
            @PathVariable ID itemId
    ) {
        return ResponseEntity.ok().body(service.findById(itemId));
    }

    @PostMapping()
    ResponseEntity<ITEM> saveItem(
            @RequestBody @Validated ITEM item
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(item));
    }

    @PutMapping()
    ResponseEntity<ITEM> updateItem(
            @RequestBody @Validated ITEM item
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.update(item));
    }

    @DeleteMapping("/{itemId}")
    ResponseEntity<Void> deleteItemById(
            @PathVariable ID itemId
    ) {
        service.deleteById(itemId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }


}
