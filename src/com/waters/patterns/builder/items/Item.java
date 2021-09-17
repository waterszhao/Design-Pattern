package com.waters.patterns.builder.items;

import com.waters.patterns.builder.packing.Packing;

public interface Item {
    String name();
    Packing packaging();
    double price();
}
