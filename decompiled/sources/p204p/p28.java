package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class p28 {

    /* JADX INFO: renamed from: a */
    public final Rect f173275a;

    /* JADX INFO: renamed from: b */
    public final int f173276b;

    /* JADX INFO: renamed from: c */
    public final int f173277c;

    /* JADX INFO: renamed from: d */
    public final boolean f173278d;

    /* JADX INFO: renamed from: e */
    public final Matrix f173279e;

    /* JADX INFO: renamed from: f */
    public final boolean f173280f;

    public p28(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f173275a = rect;
        this.f173276b = i;
        this.f173277c = i2;
        this.f173278d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f173279e = matrix;
        this.f173280f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p28) {
            p28 p28Var = (p28) obj;
            if (this.f173275a.equals(p28Var.f173275a) && this.f173276b == p28Var.f173276b && this.f173277c == p28Var.f173277c && this.f173278d == p28Var.f173278d && this.f173279e.equals(p28Var.f173279e) && this.f173280f == p28Var.f173280f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f173275a.hashCode() ^ 1000003) * 1000003) ^ this.f173276b) * 1000003) ^ this.f173277c) * 1000003) ^ (this.f173278d ? 1231 : 1237)) * 1000003) ^ this.f173279e.hashCode()) * 1000003) ^ (this.f173280f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.f173275a);
        sb.append(", getRotationDegrees=");
        sb.append(this.f173276b);
        sb.append(", getTargetRotation=");
        sb.append(this.f173277c);
        sb.append(", hasCameraTransform=");
        sb.append(this.f173278d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.f173279e);
        sb.append(", isMirroring=");
        return edb.m38570s(sb, this.f173280f, "}");
    }
}
