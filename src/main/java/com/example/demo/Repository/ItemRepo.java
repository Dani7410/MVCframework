package com.example.demo.Repository;

import com.example.demo.Model.Item;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepo {
    //this is where the actual SQL communication would have been done 
    public List<Item> fetchAllItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Computer",1000));
        items.add(new Item("Laptop",1500));
        items.add(new Item("Mobile",150));
        return items;
    }
}
