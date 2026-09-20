package p204p;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ye60 {

    /* JADX INFO: renamed from: a */
    public static final double f271925a = ((((double) 1) - 0.5d) * 4.1887902047863905d) + 3.665191429188092d;

    /* JADX INFO: renamed from: b */
    public static final PointF f271926b = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public static PointF m93526a(double d, float f) {
        double d2 = f;
        return new PointF((float) (Math.cos(d) * d2), (float) (Math.sin(d) * d2));
    }

    /* JADX INFO: renamed from: b */
    public static List m93527b(double d, double d2) {
        float fTan = ((float) (Math.tan(3.141592653589793d / ((double) 8)) * 1.3333333333333333d)) * 0.9f;
        PointF pointFM93526a = m93526a(4.1887902047863905d, 0.9f);
        double d3 = f271925a;
        PointF pointFM93526a2 = m93526a(d3, (float) ((((double) 1) - (d2 * d)) * ((double) 0.9f)));
        PointF pointF = f271926b;
        PointF pointFM93529d = m93529d(pointF, pointFM93526a2);
        PointF pointFM93526a3 = m93526a(7.330382858376184d, 0.9f);
        PointF pointFM93526a4 = m93526a(8.901179185171081d, 0.9f);
        double d4 = (d3 + 1.5707963267948966d) - (((d * ((double) 2)) * 3.141592653589793d) / 3.0d);
        pqm0 pqm0VarM93528c = m93528c(pointF, pointFM93526a3, pointFM93526a4);
        PointF pointF2 = (PointF) pqm0VarM93528c.f180350a;
        PointF pointF3 = (PointF) pqm0VarM93528c.f180351b;
        pqm0 pqm0VarM93528c2 = m93528c(pointF, pointFM93526a4, pointFM93526a);
        return h6f.m46715L(new xzl(pointFM93526a, m93529d(pointFM93526a, m93526a(5.759586531581287d, fTan)), m93529d(pointFM93529d, m93526a(d4 - 3.141592653589793d, fTan)), pointFM93529d), new xzl(pointFM93529d, m93529d(pointFM93529d, m93526a(d4, fTan)), m93529d(pointFM93526a3, m93526a(5.759586531581288d, fTan)), pointFM93526a3), new xzl(pointFM93526a3, pointF2, pointF3, pointFM93526a4), new xzl(pointFM93526a4, (PointF) pqm0VarM93528c2.f180350a, (PointF) pqm0VarM93528c2.f180351b, pointFM93526a));
    }

    /* JADX INFO: renamed from: c */
    public static pqm0 m93528c(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF2.x;
        float f2 = pointF.x;
        float f3 = f - f2;
        float f4 = pointF2.y;
        float f5 = pointF.y;
        float f6 = f4 - f5;
        float f7 = pointF3.x - f2;
        float f8 = pointF3.y - f5;
        float f9 = (f6 * f6) + (f3 * f3);
        float f10 = (f6 * f8) + (f3 * f7) + f9;
        float fSqrt = ((((float) Math.sqrt((2 * f9) * f10)) - f10) * 1.3333334f) / ((f3 * f8) - (f6 * f7));
        float f11 = pointF.x;
        float f12 = (f11 + f3) - (fSqrt * f6);
        float f13 = pointF.y;
        return new pqm0(new PointF(f12, (f3 * fSqrt) + f6 + f13), new PointF((fSqrt * f8) + f11 + f7, (f13 + f8) - (fSqrt * f7)));
    }

    /* JADX INFO: renamed from: d */
    public static PointF m93529d(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
}
