package org.progmatic;

import org.progmatic.dec3.Tree;

public class Main {

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("Anya");
        System.out.println(tree.findNode("Anya").toString());
        tree.addAsChild("Anya", "Gyerek");
        tree.addAsChild("Gyerek", "Unoka");
        System.out.println(tree.findNode("Anya").toString());
        System.out.println(tree.getSize());
    }
}
