package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, m24212d2 = {"Landroidx/xr/runtime/math/FloatSize2d;", "", "width", "", "height", "<init>", "(FF)V", "getWidth", "()F", "getHeight", "toString", "", "to3d", "Landroidx/xr/runtime/math/FloatSize3d;", "depth", "equals", "", "other", "hashCode", "", "div", "divisor", "times", "scalar", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class FloatSize2d {
    private final float height;
    private final float width;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatSize2d() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ FloatSize3d to3d$default(FloatSize2d floatSize2d, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return floatSize2d.to3d(f);
    }

    public final FloatSize2d div(float divisor) {
        return new FloatSize2d(this.width / divisor, this.height / divisor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!FloatSize2d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        FloatSize2d floatSize2d = (FloatSize2d) other;
        return this.width == floatSize2d.width && this.height == floatSize2d.height;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.hashCode(this.height) + (Float.hashCode(this.width) * 31);
    }

    public final FloatSize2d times(float scalar) {
        return new FloatSize2d(this.width * scalar, this.height * scalar);
    }

    public final FloatSize3d to3d() {
        return to3d$default(this, 0.0f, 1, null);
    }

    public String toString() {
        return super.toString() + ": w " + this.width + " x h " + this.height;
    }

    public FloatSize2d(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public final FloatSize2d div(int divisor) {
        return div(divisor);
    }

    public final FloatSize2d times(int scalar) {
        return times(scalar);
    }

    public final FloatSize3d to3d(float depth) {
        return new FloatSize3d(this.width, this.height, depth);
    }

    public /* synthetic */ FloatSize2d(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
