package org.example;

import org.example.model.Product;
import org.example.state.ImportedState;
import org.example.state.LuxuryState;
import org.example.state.NormalState;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Sản phẩm thường", 100, new NormalState());
        Product p2 = new Product("Sản phẩm nhập khẩu", 100, new ImportedState());
        Product p3 = new Product("Sản phẩm xa xỉ", 100, new LuxuryState());

        p1.display();
        p2.display();
        p3.display();
    }
}