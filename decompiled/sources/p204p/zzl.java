package p204p;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class zzl {

    /* JADX INFO: renamed from: a */
    public final PointF f288023a;

    /* JADX INFO: renamed from: b */
    public final PointF f288024b;

    /* JADX INFO: renamed from: c */
    public final PointF f288025c;

    public zzl() {
        this.f288023a = new PointF();
        this.f288024b = new PointF();
        this.f288025c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f288025c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f288023a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f288024b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public zzl(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f288023a = pointF;
        this.f288024b = pointF2;
        this.f288025c = pointF3;
    }
}
