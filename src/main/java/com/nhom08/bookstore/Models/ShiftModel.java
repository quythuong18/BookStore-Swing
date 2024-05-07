/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom08.bookstore.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author MSI
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ShiftModel {
    private String id;
    private String name;
    private String shift;
    private String date;
    private String position;

  
}
