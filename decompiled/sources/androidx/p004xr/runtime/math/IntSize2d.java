package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, m24212d2 = {"Landroidx/xr/runtime/math/IntSize2d;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "toString", "", "equals", "", "other", "hashCode", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class IntSize2d {
    private final int height;
    private final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    public IntSize2d() {
        int i = 0;
        this(i, i, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!IntSize2d.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        IntSize2d intSize2d = (IntSize2d) other;
        return this.width == intSize2d.width && this.height == intSize2d.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return super.toString() + ": w " + this.width + " x h " + this.height;
    }

    public IntSize2d(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public /* synthetic */ IntSize2d(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
