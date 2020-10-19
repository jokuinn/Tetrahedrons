package com.epam.tetrahedron.data;

public class Tetrahedron {

    double x1;
    double y1;
    double z1;

    double x2;
    double y2;
    double z2;

    double x3;
    double y3;
    double z3;

    double x4;
    double y4;
    double z4;

    public Tetrahedron(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4, double z1, double z2, double z3, double z4) throws DataException {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;

        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;

        this.x3 = x3;
        this.y3 = y3;
        this.z3 = z3;

        this.x4 = x4;
        this.y4 = y4;
        this.z4 = z4;

    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getX4() {
        return x4;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getY4() {
        return y4;
    }

    public double getZ1() {
        return z1;
    }

    public double getZ2() {
        return z2;
    }

    public double getZ3() {
        return z3;
    }

    public double getZ4() {
        return z4;
    }
}
