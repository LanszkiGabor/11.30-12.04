package org.progmatic;

import org.progmatic.dec2.Circle;
import org.progmatic.dec2.FiveLetters;
import org.progmatic.dec3.Tree;
import org.w3c.dom.Node;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Tree tree = new Tree("Anya");
        System.out.println(tree.findNode("Anya").toString());
        tree.addAsChild("Anya", "Gyerek");
        System.out.println(tree.findNode("Anya").toString());
    }
}
