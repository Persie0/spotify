package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0014"}, m24212d2 = {"Landroidx/xr/runtime/math/FieldOfView;", "", "angleLeft", "", "angleRight", "angleUp", "angleDown", "<init>", "(FFFF)V", "getAngleLeft", "()F", "getAngleRight", "getAngleUp", "getAngleDown", "equals", "", "other", "hashCode", "", "copy", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class FieldOfView {
    private final float angleDown;
    private final float angleLeft;
    private final float angleRight;
    private final float angleUp;

    public FieldOfView() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ FieldOfView copy$default(FieldOfView fieldOfView, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fieldOfView.angleLeft;
        }
        if ((i & 2) != 0) {
            f2 = fieldOfView.angleRight;
        }
        if ((i & 4) != 0) {
            f3 = fieldOfView.angleUp;
        }
        if ((i & 8) != 0) {
            f4 = fieldOfView.angleDown;
        }
        return fieldOfView.copy(f, f2, f3, f4);
    }

    public final FieldOfView copy() {
        return copy$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldOfView)) {
            return false;
        }
        FieldOfView fieldOfView = (FieldOfView) other;
        return this.angleLeft == fieldOfView.angleLeft && this.angleRight == fieldOfView.angleRight && this.angleUp == fieldOfView.angleUp && this.angleDown == fieldOfView.angleDown;
    }

    public final float getAngleDown() {
        return this.angleDown;
    }

    public final float getAngleLeft() {
        return this.angleLeft;
    }

    public final float getAngleRight() {
        return this.angleRight;
    }

    public final float getAngleUp() {
        return this.angleUp;
    }

    public int hashCode() {
        return Float.hashCode(this.angleDown) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.angleLeft) * 31, 31, this.angleRight), 31, this.angleUp);
    }

    public FieldOfView(float f, float f2, float f3, float f4) {
        this.angleLeft = f;
        this.angleRight = f2;
        this.angleUp = f3;
        this.angleDown = f4;
    }

    public final FieldOfView copy(float f) {
        return copy$default(this, f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final FieldOfView copy(float f, float f2) {
        return copy$default(this, f, f2, 0.0f, 0.0f, 12, null);
    }

    public final FieldOfView copy(float f, float f2, float f3) {
        return copy$default(this, f, f2, f3, 0.0f, 8, null);
    }

    public final FieldOfView copy(float angleLeft, float angleRight, float angleUp, float angleDown) {
        return new FieldOfView(angleLeft, angleRight, angleUp, angleDown);
    }

    public /* synthetic */ FieldOfView(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0471976f : f, (i & 2) != 0 ? 1.0471976f : f2, (i & 4) != 0 ? 1.0471976f : f3, (i & 8) != 0 ? 1.0471976f : f4);
    }
}
