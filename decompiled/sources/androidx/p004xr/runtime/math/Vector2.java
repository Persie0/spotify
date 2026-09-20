package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bga;
import p204p.l4b1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 /2\u00020\u0001:\u00010B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\bJ\u0010\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b*\u0010)R\u0012\u0010,\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0012\u0010.\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010)¨\u00061"}, m24212d2 = {"Landroidx/xr/runtime/math/Vector2;", "", "", "x", "y", "<init>", "(FF)V", "other", "(Landroidx/xr/runtime/math/Vector2;)V", "unaryMinus", "()Landroidx/xr/runtime/math/Vector2;", "plus", "(Landroidx/xr/runtime/math/Vector2;)Landroidx/xr/runtime/math/Vector2;", "minus", "c", "times", "(F)Landroidx/xr/runtime/math/Vector2;", "scale", "div", "inverse", "toNormalized", "cross", "(Landroidx/xr/runtime/math/Vector2;)F", "dot", "min", "max", "clamp", "(Landroidx/xr/runtime/math/Vector2;Landroidx/xr/runtime/math/Vector2;)Landroidx/xr/runtime/math/Vector2;", "copy", "(FF)Landroidx/xr/runtime/math/Vector2;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "()F", "getY", "getLengthSquared", "lengthSquared", "getLength", "length", "Companion", "p/l4b1", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class Vector2 {
    private static final float EPSILON = 1.0E-15f;
    private final float x;
    private final float y;
    public static final l4b1 Companion = new l4b1();
    public static final Vector2 Zero = new Vector2(0.0f, 0.0f);
    public static final Vector2 One = new Vector2(1.0f, 1.0f);

    /* JADX INFO: renamed from: Up */
    public static final Vector2 f1452Up = new Vector2(0.0f, 1.0f);
    public static final Vector2 Down = new Vector2(0.0f, -1.0f);
    public static final Vector2 Left = new Vector2(-1.0f, 0.0f);
    public static final Vector2 Right = new Vector2(1.0f, 0.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    public Vector2() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static final Vector2 abs(Vector2 vector2) {
        Companion.getClass();
        return new Vector2(Math.abs(vector2.getX()), Math.abs(vector2.getY()));
    }

    public static final float angularDistance(Vector2 vector2, Vector2 vector3) {
        Companion.getClass();
        float y = (vector3.getY() * vector2.getY()) + (vector3.getX() * vector2.getX());
        float fSqrt = ((float) Math.sqrt((vector2.getY() * vector2.getY()) + (vector2.getX() * vector2.getX()))) * ((float) Math.sqrt((vector3.getY() * vector3.getY()) + (vector3.getX() * vector3.getX())));
        if (fSqrt < 1.0E-10f) {
            return 0.0f;
        }
        return ((float) Math.acos(bga.m29096r(y / fSqrt, -1.0f, 1.0f))) * 57.295776f;
    }

    public static /* synthetic */ Vector2 copy$default(Vector2 vector2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = vector2.getX();
        }
        if ((i & 2) != 0) {
            f2 = vector2.getY();
        }
        return new Vector2(f, f2);
    }

    public static final float distance(Vector2 vector2, Vector2 vector3) {
        Companion.getClass();
        Vector2 vector4 = new Vector2(vector2.getX() - vector3.getX(), vector2.getY() - vector3.getY());
        return (float) Math.sqrt((vector4.getY() * vector4.getY()) + (vector4.getX() * vector4.getX()));
    }

    public static final Vector2 lerp(Vector2 vector2, Vector2 vector3, float f) {
        Companion.getClass();
        return new Vector2(bga.m29068K(vector2.getX(), vector3.getX(), f), bga.m29068K(vector2.getY(), vector3.getY(), f));
    }

    public final Vector2 clamp(Vector2 min, Vector2 max) {
        return new Vector2(Math.min(Math.max(this.x, min.x), max.x), Math.min(Math.max(this.y, min.y), max.y));
    }

    public final Vector2 copy(float x, float y) {
        return new Vector2(x, y);
    }

    public final float cross(Vector2 other) {
        return (other.getY() * getX()) - (other.getX() * getY());
    }

    public final Vector2 div(float c) {
        return new Vector2(getX() / c, getY() / c);
    }

    public final float dot(Vector2 other) {
        return (other.getY() * getY()) + (other.getX() * getX());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector2)) {
            return false;
        }
        Vector2 vector2 = (Vector2) other;
        return this.x == vector2.x && this.y == vector2.y;
    }

    public final float getLength() {
        return (float) Math.sqrt((getY() * getY()) + (getX() * getX()));
    }

    public final float getLengthSquared() {
        return (getY() * getY()) + (getX() * getX());
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final Vector2 inverse() {
        float f = this.x;
        if (f != 0.0f) {
            float f2 = this.y;
            if (f2 != 0.0f) {
                float f3 = 1;
                return new Vector2(f3 / f, f3 / f2);
            }
        }
        throw new IllegalArgumentException("Cannot take the multiplicative inverse if any component of the Vector2 is zero.");
    }

    public final Vector2 minus(Vector2 other) {
        return new Vector2(getX() - other.getX(), getY() - other.getY());
    }

    public final Vector2 plus(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public final Vector2 scale(Vector2 other) {
        return new Vector2(other.getX() * getX(), other.getY() * getY());
    }

    public final Vector2 times(float c) {
        return new Vector2(getX() * c, getY() * c);
    }

    public final Vector2 toNormalized() {
        float y = (getY() * getY()) + (getX() * getX());
        if (y < EPSILON) {
            return Zero;
        }
        float fSqrt = 1 / ((float) Math.sqrt(y));
        return new Vector2(this.x * fSqrt, this.y * fSqrt);
    }

    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + "]";
    }

    public final Vector2 unaryMinus() {
        return new Vector2(-getX(), -getY());
    }

    public Vector2(float f) {
        this(f, 0.0f, 2, null);
    }

    public final Vector2 copy() {
        return new Vector2(getX(), getY());
    }

    public Vector2(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final Vector2 copy(float f) {
        return new Vector2(f, getY());
    }

    public /* synthetic */ Vector2(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public Vector2(Vector2 vector2) {
        this(vector2.x, vector2.y);
    }
}
