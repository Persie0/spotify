package androidx.car.app.model;

import java.util.Objects;
import p204p.klh;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Shape {
    public static final int TYPE_CORNER_EXTRA_LARGE = 6;
    public static final int TYPE_CORNER_EXTRA_SMALL = 2;
    public static final int TYPE_CORNER_FULL = 7;
    public static final int TYPE_CORNER_LARGE = 5;
    public static final int TYPE_CORNER_MEDIUM = 4;
    public static final int TYPE_CORNER_SMALL = 3;
    public static final int TYPE_NONE = 1;
    private final int mShapeType;
    public static final Shape NONE = new Shape(1);
    public static final Shape CORNER_EXTRA_SMALL = new Shape(2);
    public static final Shape CORNER_SMALL = new Shape(3);
    public static final Shape CORNER_MEDIUM = new Shape(4);
    public static final Shape CORNER_LARGE = new Shape(5);
    public static final Shape CORNER_EXTRA_LARGE = new Shape(6);
    public static final Shape CORNER_FULL = new Shape(7);

    private Shape(int i) {
        this.mShapeType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Shape) && this.mShapeType == ((Shape) obj).mShapeType;
    }

    public int getShapeType() {
        return this.mShapeType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mShapeType));
    }

    public String toString() {
        return klh.m56832d(this.mShapeType, " }", new StringBuilder("Shape { shapeType: "));
    }

    private Shape() {
        this.mShapeType = 1;
    }
}
