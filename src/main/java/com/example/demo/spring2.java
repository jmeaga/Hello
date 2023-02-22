package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class spring2 {
 private String yourFavColor="Violet";
 @GetMapping("/")
 public String getMyFav() {
  return "My Fav Color is "+yourFavColor;
 }

}

