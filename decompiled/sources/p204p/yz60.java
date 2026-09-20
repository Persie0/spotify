package p204p;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz60 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f277703a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final po10 f277704b = po10.m70454i("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c */
    public static final po10 f277705c = po10.m70454i("x", "y");

    /* JADX INFO: renamed from: a */
    public static BaseInterpolator m94963a(PointF pointF, PointF pointF2) {
        pointF.x = eff0.m38732b(pointF.x, -1.0f, 1.0f);
        pointF.y = eff0.m38732b(pointF.y, -100.0f, 100.0f);
        pointF2.x = eff0.m38732b(pointF2.x, -1.0f, 1.0f);
        float fM38732b = eff0.m38732b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM38732b;
        qlo qloVar = x0b1.f256851a;
        try {
            return gug1.m45779u(pointF.x, pointF.y, pointF2.x, fM38732b);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? gug1.m45779u(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public static wz60 m94964b(yl60 yl60Var, u8b0 u8b0Var, float f, t3b1 t3b1Var, boolean z, boolean z2) {
        Object obj;
        BaseInterpolator baseInterpolatorM94963a;
        BaseInterpolator baseInterpolatorM94963a2;
        BaseInterpolator baseInterpolatorM94963a3;
        Object obj2;
        wz60 wz60Var;
        po10 po10Var;
        po10 po10Var2;
        PointF pointF;
        po10 po10Var3 = f277704b;
        LinearInterpolator linearInterpolator = f277703a;
        if (!z || !z2) {
            po10 po10Var4 = po10Var3;
            if (!z) {
                return new wz60(t3b1Var.mo41272f(yl60Var, f));
            }
            yl60Var.mo53760c();
            PointF pointFM62269b = null;
            PointF pointFM62269b2 = null;
            PointF pointFM62269b3 = null;
            PointF pointFM62269b4 = null;
            boolean z3 = false;
            Object objMo41272f = null;
            float fMo53765k = 0.0f;
            Object objMo41272f2 = null;
            while (yl60Var.mo53763h()) {
                po10Var4 = po10Var4;
                switch (yl60Var.mo53769s(po10Var4)) {
                    case 0:
                        fMo53765k = (float) yl60Var.mo53765k();
                        continue;
                    case 1:
                        objMo41272f = t3b1Var.mo41272f(yl60Var, f);
                        break;
                    case 2:
                        objMo41272f2 = t3b1Var.mo41272f(yl60Var, f);
                        break;
                    case 3:
                        pointFM62269b4 = mm60.m62269b(yl60Var, 1.0f);
                        break;
                    case 4:
                        pointFM62269b = mm60.m62269b(yl60Var, 1.0f);
                        break;
                    case 5:
                        z3 = yl60Var.mo53766n() == 1;
                        break;
                    case 6:
                        pointFM62269b2 = mm60.m62269b(yl60Var, f);
                        break;
                    case 7:
                        pointFM62269b3 = mm60.m62269b(yl60Var, f);
                        break;
                    default:
                        yl60Var.mo53771x();
                        break;
                }
            }
            yl60Var.mo53762f();
            if (!z3) {
                if (pointFM62269b4 == null || pointFM62269b == null) {
                    obj = objMo41272f2;
                } else {
                    baseInterpolatorM94963a = m94963a(pointFM62269b4, pointFM62269b);
                    obj = objMo41272f2;
                }
                wz60 wz60Var2 = new wz60(u8b0Var, objMo41272f, obj, baseInterpolatorM94963a, fMo53765k, (Float) null);
                wz60Var2.f256506o = pointFM62269b2;
                wz60Var2.f256507p = pointFM62269b3;
                return wz60Var2;
            }
            obj = objMo41272f;
            baseInterpolatorM94963a = linearInterpolator;
            wz60 wz60Var3 = new wz60(u8b0Var, objMo41272f, obj, baseInterpolatorM94963a, fMo53765k, (Float) null);
            wz60Var3.f256506o = pointFM62269b2;
            wz60Var3.f256507p = pointFM62269b3;
            return wz60Var3;
        }
        yl60Var.mo53760c();
        PointF pointF2 = null;
        PointF pointFM62269b5 = null;
        PointF pointFM62269b6 = null;
        boolean z4 = false;
        PointF pointFM62269b7 = null;
        PointF pointFM62269b8 = null;
        PointF pointF3 = null;
        Object objMo41272f3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fMo53765k2 = 0.0f;
        Object objMo41272f4 = null;
        while (yl60Var.mo53763h()) {
            int iMo53769s = yl60Var.mo53769s(po10Var3);
            po10 po10Var5 = f277705c;
            linearInterpolator = linearInterpolator;
            switch (iMo53769s) {
                case 0:
                    po10Var = po10Var3;
                    fMo53765k2 = (float) yl60Var.mo53765k();
                    po10Var3 = po10Var;
                    break;
                case 1:
                    po10Var = po10Var3;
                    objMo41272f3 = t3b1Var.mo41272f(yl60Var, f);
                    po10Var3 = po10Var;
                    break;
                case 2:
                    po10Var = po10Var3;
                    objMo41272f4 = t3b1Var.mo41272f(yl60Var, f);
                    po10Var3 = po10Var;
                    break;
                case 3:
                    po10Var = po10Var3;
                    boolean z5 = z4;
                    Object obj3 = objMo41272f3;
                    PointF pointF6 = pointF4;
                    if (yl60Var.mo53768p() == 3) {
                        yl60Var.mo53760c();
                        float fMo53765k3 = 0.0f;
                        float fMo53765k4 = 0.0f;
                        float fMo53765k5 = 0.0f;
                        float fMo53765k6 = 0.0f;
                        while (yl60Var.mo53763h()) {
                            int iMo53769s2 = yl60Var.mo53769s(po10Var5);
                            if (iMo53769s2 != 0) {
                                if (iMo53769s2 != 1) {
                                    yl60Var.mo53771x();
                                } else if (yl60Var.mo53768p() == 7) {
                                    fMo53765k6 = (float) yl60Var.mo53765k();
                                    fMo53765k4 = fMo53765k6;
                                } else {
                                    yl60Var.mo53759a();
                                    fMo53765k4 = (float) yl60Var.mo53765k();
                                    fMo53765k6 = yl60Var.mo53768p() == 7 ? (float) yl60Var.mo53765k() : fMo53765k4;
                                    yl60Var.mo53761e();
                                }
                            } else if (yl60Var.mo53768p() == 7) {
                                fMo53765k5 = (float) yl60Var.mo53765k();
                                fMo53765k3 = fMo53765k5;
                            } else {
                                yl60Var.mo53759a();
                                fMo53765k3 = (float) yl60Var.mo53765k();
                                fMo53765k5 = yl60Var.mo53768p() == 7 ? (float) yl60Var.mo53765k() : fMo53765k3;
                                yl60Var.mo53761e();
                            }
                        }
                        PointF pointF7 = new PointF(fMo53765k3, fMo53765k4);
                        pointF4 = new PointF(fMo53765k5, fMo53765k6);
                        yl60Var.mo53762f();
                        pointF3 = pointF7;
                    } else {
                        pointFM62269b7 = mm60.m62269b(yl60Var, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objMo41272f3 = obj3;
                    po10Var3 = po10Var;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (yl60Var.mo53768p() == 3) {
                        yl60Var.mo53760c();
                        float fMo53765k7 = 0.0f;
                        float fMo53765k8 = 0.0f;
                        float fMo53765k9 = 0.0f;
                        float fMo53765k10 = 0.0f;
                        while (yl60Var.mo53763h()) {
                            Object obj4 = objMo41272f3;
                            int iMo53769s3 = yl60Var.mo53769s(po10Var5);
                            if (iMo53769s3 != 0) {
                                po10Var2 = po10Var3;
                                if (iMo53769s3 != 1) {
                                    yl60Var.mo53771x();
                                } else if (yl60Var.mo53768p() == 7) {
                                    fMo53765k10 = (float) yl60Var.mo53765k();
                                    pointF4 = pointF4;
                                    fMo53765k8 = fMo53765k10;
                                } else {
                                    pointF = pointF4;
                                    yl60Var.mo53759a();
                                    fMo53765k8 = (float) yl60Var.mo53765k();
                                    fMo53765k10 = yl60Var.mo53768p() == 7 ? (float) yl60Var.mo53765k() : fMo53765k8;
                                    yl60Var.mo53761e();
                                    pointF4 = pointF;
                                }
                            } else {
                                po10Var2 = po10Var3;
                                pointF = pointF4;
                                if (yl60Var.mo53768p() == 7) {
                                    fMo53765k9 = (float) yl60Var.mo53765k();
                                    pointF4 = pointF;
                                    fMo53765k7 = fMo53765k9;
                                } else {
                                    yl60Var.mo53759a();
                                    fMo53765k7 = (float) yl60Var.mo53765k();
                                    fMo53765k9 = yl60Var.mo53768p() == 7 ? (float) yl60Var.mo53765k() : fMo53765k7;
                                    yl60Var.mo53761e();
                                    pointF4 = pointF;
                                }
                            }
                            objMo41272f3 = obj4;
                            po10Var3 = po10Var2;
                        }
                        po10Var = po10Var3;
                        PointF pointF8 = new PointF(fMo53765k7, fMo53765k8);
                        pointF2 = new PointF(fMo53765k9, fMo53765k10);
                        yl60Var.mo53762f();
                        pointF5 = pointF8;
                    } else {
                        po10Var = po10Var3;
                        pointFM62269b8 = mm60.m62269b(yl60Var, f);
                    }
                    z4 = z6;
                    po10Var3 = po10Var;
                    break;
                case 5:
                    z4 = yl60Var.mo53766n() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFM62269b5 = mm60.m62269b(yl60Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFM62269b6 = mm60.m62269b(yl60Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    yl60Var.mo53771x();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorM94963a4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objMo41272f3;
        PointF pointF9 = pointF4;
        yl60Var.mo53762f();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFM62269b7 == null || pointFM62269b8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorM94963a2 = m94963a(pointF3, pointF5);
                    baseInterpolatorM94963a3 = m94963a(pointF9, pointF2);
                    obj2 = objMo41272f4;
                    baseInterpolatorM94963a4 = null;
                }
                if (baseInterpolatorM94963a2 != null || baseInterpolatorM94963a3 == null) {
                    wz60Var = new wz60(u8b0Var, obj5, obj2, baseInterpolatorM94963a4, fMo53765k2, (Float) null);
                } else {
                    wz60Var = new wz60(u8b0Var, obj5, obj2, baseInterpolatorM94963a2, baseInterpolatorM94963a3, fMo53765k2);
                }
                wz60Var.f256506o = pointFM62269b5;
                wz60Var.f256507p = pointFM62269b6;
                return wz60Var;
            }
            baseInterpolatorM94963a4 = m94963a(pointFM62269b7, pointFM62269b8);
            obj2 = objMo41272f4;
        }
        baseInterpolatorM94963a2 = null;
        baseInterpolatorM94963a3 = null;
        if (baseInterpolatorM94963a2 != null) {
            wz60Var = new wz60(u8b0Var, obj5, obj2, baseInterpolatorM94963a4, fMo53765k2, (Float) null);
        } else {
            wz60Var = new wz60(u8b0Var, obj5, obj2, baseInterpolatorM94963a4, fMo53765k2, (Float) null);
        }
        wz60Var.f256506o = pointFM62269b5;
        wz60Var.f256507p = pointFM62269b6;
        return wz60Var;
    }
}
