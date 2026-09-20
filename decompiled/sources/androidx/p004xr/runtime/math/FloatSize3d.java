package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0000a;
import p204p.zhz;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000  2\u00020\u0001:\u0001!B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, m24212d2 = {"Landroidx/xr/runtime/math/FloatSize3d;", "", "", "width", "height", "depth", "<init>", "(FFF)V", "Landroidx/xr/runtime/math/FloatSize2d;", "to2d", "()Landroidx/xr/runtime/math/FloatSize2d;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "divisor", "div", "(F)Landroidx/xr/runtime/math/FloatSize3d;", "(I)Landroidx/xr/runtime/math/FloatSize3d;", "scalar", "times", "F", "getWidth", "()F", "getHeight", "getDepth", "Companion", "p/zhz", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class FloatSize3d {
    public static final zhz Companion = new zhz();
    private final float depth;
    private final float height;
    private final float width;

    public FloatSize3d() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static final FloatSize3d fromVector3(Vector3 vector3) {
        Companion.getClass();
        return new FloatSize3d(vector3.getX(), vector3.getY(), vector3.getZ());
    }

    public final FloatSize3d div(float divisor) {
        return new FloatSize3d(this.width / divisor, this.height / divisor, this.depth / divisor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FloatSize3d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        FloatSize3d floatSize3d = (FloatSize3d) other;
        return this.width == floatSize3d.width && this.height == floatSize3d.height && this.depth == floatSize3d.depth;
    }

    public final float getDepth() {
        return this.depth;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.hashCode(this.depth) + AbstractC0000a.m8g(Float.hashCode(this.width) * 31, 31, this.height);
    }

    public final FloatSize3d times(float scalar) {
        return new FloatSize3d(this.width * scalar, this.height * scalar, this.depth * scalar);
    }

    public final FloatSize2d to2d() {
        return new FloatSize2d(this.width, this.height);
    }

    public String toString() {
        return super.toString() + ": w " + this.width + " x h " + this.height + " x d " + this.depth;
    }

    public FloatSize3d(float f, float f2, float f3) {
        this.width = f;
        this.height = f2;
        this.depth = f3;
    }

    public final FloatSize3d div(int divisor) {
        return div(divisor);
    }

    public final FloatSize3d times(int scalar) {
        return times(scalar);
    }

    public /* synthetic */ FloatSize3d(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }
}
