package org.progmatic.dec3;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    private Node<T> root;
    private List<Node<T>> tree = new ArrayList<>();

    /**
     * Konstruktor, ami létrehoz egy fát egy darab gyökérelemmel
     * @param rootData
     */
    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.children = new ArrayList<Node<T>>();
        tree.add(root);
    }

    /**
     * Megkeresi a nodeValue-t tartalmazó csúcsot, és azt visszaadja.
     * A keresés az equals metódus alapján történik!
     * @param nodeValue
     * @return a megtalált Node-ot, vagy null-t, ha nincs Node ezzel a nodeValue-val.
     */
    public Node<T> findNode(T nodeValue) {
        for (Node<T> tNode : tree) {
            if (tNode.data.equals(nodeValue)) {
                return tNode;
            }
        }
        return null;
    }

    /**
     * megkeresi a fában azt a Node-ot,
     * aminek értéke parentNode-al egyezik meg, és ehhez hozzáadja
     * a new Node-ból elkészített Node-ot
     * @param parentnodeValue
     * @param newNodeValue
     * @return
     */
    public Node<T> addAsChild(T parentnodeValue, T newNodeValue) {
        Node<T> parent = findNode(parentnodeValue);
        Node<T> child = new Node<T>();
        child.data = newNodeValue;
        tree.add(child);
        parent.children.add(child);
        return child;
    }

    /**
     * Visszadja a fában lévő csúcsok számát
     * @return
     */
    public int getSize(){
        return tree.size();
    }

    public class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children = new ArrayList<>();

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", children=" + children +
                    '}';
        }
    }
}
