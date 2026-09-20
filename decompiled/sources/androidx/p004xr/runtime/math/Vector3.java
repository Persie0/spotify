package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0000a;
import p204p.bga;
import p204p.m4b1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 12\u00020\u0001:\u00012B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u000bJ\u001d\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b,\u0010*R\u0012\u0010.\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0012\u00100\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b/\u0010*¨\u00063"}, m24212d2 = {"Landroidx/xr/runtime/math/Vector3;", "", "", "x", "y", "z", "<init>", "(FFF)V", "other", "(Landroidx/xr/runtime/math/Vector3;)V", "unaryMinus", "()Landroidx/xr/runtime/math/Vector3;", "plus", "(Landroidx/xr/runtime/math/Vector3;)Landroidx/xr/runtime/math/Vector3;", "minus", "c", "times", "(F)Landroidx/xr/runtime/math/Vector3;", "scale", "div", "dot", "(Landroidx/xr/runtime/math/Vector3;)F", "cross", "inverse", "toNormalized", "min", "max", "clamp", "(Landroidx/xr/runtime/math/Vector3;Landroidx/xr/runtime/math/Vector3;)Landroidx/xr/runtime/math/Vector3;", "copy", "(FFF)Landroidx/xr/runtime/math/Vector3;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getX", "()F", "getY", "getZ", "getLengthSquared", "lengthSquared", "getLength", "length", "Companion", "p/m4b1", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class Vector3 {
    private static final float EPSILON = 1.0E-15f;
    private final float x;
    private final float y;
    private final float z;
    public static final m4b1 Companion = new m4b1();
    public static final Vector3 Zero = new Vector3(0.0f, 0.0f, 0.0f);
    public static final Vector3 One = new Vector3(1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: Up */
    public static final Vector3 f1455Up = new Vector3(0.0f, 1.0f, 0.0f);
    public static final Vector3 Down = new Vector3(0.0f, -1.0f, 0.0f);
    public static final Vector3 Left = new Vector3(-1.0f, 0.0f, 0.0f);
    public static final Vector3 Right = new Vector3(1.0f, 0.0f, 0.0f);
    public static final Vector3 Backward = new Vector3(0.0f, 0.0f, 1.0f);
    public static final Vector3 Forward = new Vector3(0.0f, 0.0f, -1.0f);

    public Vector3() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static final Vector3 abs(Vector3 vector3) {
        Companion.getClass();
        return new Vector3(Math.abs(vector3.getX()), Math.abs(vector3.getY()), Math.abs(vector3.getZ()));
    }

    public static final float angleBetween(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        float fSqrt = (float) Math.sqrt((vector3.getZ() * vector3.getZ()) + (vector3.getY() * vector3.getY()) + (vector3.getX() * vector3.getX()));
        float fSqrt2 = (float) Math.sqrt((vector4.getZ() * vector4.getZ()) + (vector4.getY() * vector4.getY()) + (vector4.getX() * vector4.getX()));
        if (fSqrt < EPSILON || fSqrt2 < EPSILON) {
            return 0.0f;
        }
        return ((float) Math.acos(bga.m29096r(vector3.dot(vector4) / (fSqrt * fSqrt2), -1.0f, 1.0f))) * 57.295776f;
    }

    public static /* synthetic */ Vector3 copy$default(Vector3 vector3, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = vector3.x;
        }
        if ((i & 2) != 0) {
            f2 = vector3.y;
        }
        if ((i & 4) != 0) {
            f3 = vector3.z;
        }
        return vector3.copy(f, f2, f3);
    }

    public static final float distance(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        return m4b1.m60807a(vector3, vector4);
    }

    public static final Vector3 fromValue(float f) {
        Companion.getClass();
        return new Vector3(f, f, f);
    }

    public static final Vector3 lerp(Vector3 vector3, Vector3 vector4, float f) {
        Companion.getClass();
        return m4b1.m60808b(vector3, vector4, f);
    }

    public static final Vector3 max(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        return new Vector3(Math.max(vector3.getX(), vector4.getX()), Math.max(vector3.getY(), vector4.getY()), Math.max(vector3.getZ(), vector4.getZ()));
    }

    public static final Vector3 min(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        return new Vector3(Math.min(vector3.getX(), vector4.getX()), Math.min(vector3.getY(), vector4.getY()), Math.min(vector3.getZ(), vector4.getZ()));
    }

    public static final Vector3 projectOnPlane(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        return vector3.minus(vector4.times(vector3.dot(vector4)).div(vector4.dot(vector4)));
    }

    public final Vector3 clamp(Vector3 min, Vector3 max) {
        return new Vector3(bga.m29096r(this.x, min.x, max.x), bga.m29096r(this.y, min.y, max.y), bga.m29096r(this.z, min.z, max.z));
    }

    public final Vector3 copy() {
        return copy$default(this, 0.0f, 0.0f, 0.0f, 7, null);
    }

    public final Vector3 cross(Vector3 other) {
        float f = this.y;
        float f2 = other.z;
        float f3 = this.z;
        float f4 = other.y;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = other.x;
        float f7 = this.x;
        return new Vector3(f5, (f3 * f6) - (f2 * f7), (f7 * f4) - (f * f6));
    }

    public final Vector3 div(float c) {
        return new Vector3(this.x / c, this.y / c, this.z / c);
    }

    public final float dot(Vector3 other) {
        return (this.z * other.z) + (this.y * other.y) + (this.x * other.x);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector3)) {
            return false;
        }
        Vector3 vector3 = (Vector3) other;
        return this.x == vector3.x && this.y == vector3.y && this.z == vector3.z;
    }

    public final float getLength() {
        return (float) Math.sqrt((getZ() * getZ()) + (getY() * getY()) + (getX() * getX()));
    }

    public final float getLengthSquared() {
        return (getZ() * getZ()) + (getY() * getY()) + (getX() * getX());
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return Float.hashCode(this.z) + AbstractC0000a.m8g(Float.hashCode(this.x) * 31, 31, this.y);
    }

    public final Vector3 inverse() {
        float f = this.x;
        if (f != 0.0f) {
            float f2 = this.y;
            if (f2 != 0.0f) {
                float f3 = this.z;
                if (f3 != 0.0f) {
                    float f4 = 1;
                    return new Vector3(f4 / f, f4 / f2, f4 / f3);
                }
            }
        }
        throw new IllegalArgumentException("Cannot take the multiplicative inverse if any component of the Vector3 is zero.");
    }

    public final Vector3 minus(Vector3 other) {
        return new Vector3(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public final Vector3 plus(Vector3 other) {
        return new Vector3(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public final Vector3 scale(Vector3 other) {
        return new Vector3(this.x * other.x, this.y * other.y, this.z * other.z);
    }

    public final Vector3 times(float c) {
        return new Vector3(this.x * c, this.y * c, this.z * c);
    }

    public final Vector3 toNormalized() {
        float z = (getZ() * getZ()) + (getY() * getY()) + (getX() * getX());
        if (z < EPSILON) {
            return Zero;
        }
        float fSqrt = 1 / ((float) Math.sqrt(z));
        return new Vector3(this.x * fSqrt, this.y * fSqrt, this.z * fSqrt);
    }

    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + ", z=" + this.z + "]";
    }

    public final Vector3 unaryMinus() {
        return new Vector3(-this.x, -this.y, -this.z);
    }

    public Vector3(float f) {
        this(f, 0.0f, 0.0f, 6, null);
    }

    public final Vector3 copy(float f) {
        return copy$default(this, f, 0.0f, 0.0f, 6, null);
    }

    public Vector3(float f, float f2) {
        this(f, f2, 0.0f, 4, null);
    }

    public final Vector3 copy(float f, float f2) {
        return copy$default(this, f, f2, 0.0f, 4, null);
    }

    public Vector3(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final Vector3 copy(float x, float y, float z) {
        return new Vector3(x, y, z);
    }

    public /* synthetic */ Vector3(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }

    public Vector3(Vector3 vector3) {
        this(vector3.x, vector3.y, vector3.z);
    }
}
