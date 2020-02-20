package com.google.hashcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Library {
  private Set<Book> books;
  private Integer signUpTime_T;
  private Integer scanPerDay_M;
}
