package com.github.varunpant.quadtree;

public class Node<T> {

    private double x;
    private double y;
    private double w;
    private double h;
    private Node<T> opt_parent;
    private Point<T> point;
    private NodeType nodetype = NodeType.EMPTY;
    private Node<T> nw;
    private Node<T> ne;
    private Node<T> sw;
    private Node<T> se;

    /**
     * Constructs a new quad tree node.
     *
     * @param {double} x X-coordiate of node.
     * @param {double} y Y-coordinate of node.
     * @param {double} w Width of node.
     * @param {double} h Height of node.
     * @param {Node}   opt_parent Optional parent node.
     * @constructor
     */
    public Node(double x, double y, double w, double h, Node<T> opt_parent) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.opt_parent = opt_parent;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Node<T> getParent() {
        return opt_parent;
    }

    public void setParent(Node<T> opt_parent) {
        this.opt_parent = opt_parent;
    }

    public void setPoint(Point<T> point) {
        this.point = point;
    }

    public Point<T> getPoint() {
        return this.point;
    }

    public void setNodeType(NodeType nodetype) {
        this.nodetype = nodetype;
    }

    public NodeType getNodeType() {
        return this.nodetype;
    }


    public void setNw(Node<T> nw) {
        this.nw = nw;
    }

    public void setNe(Node<T> ne) {
        this.ne = ne;
    }

    public void setSw(Node<T> sw) {
        this.sw = sw;
    }

    public void setSe(Node<T> se) {
        this.se = se;
    }

    public Node<T> getNe() {
        return ne;
    }

    public Node<T> getNw() {
        return nw;
    }

    public Node<T> getSw() {
        return sw;
    }

    public Node<T> getSe() {
        return se;
    }
}
