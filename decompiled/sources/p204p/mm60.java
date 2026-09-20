package p204p;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class mm60 {

    /* JADX INFO: renamed from: a */
    public static final po10 f145056a = po10.m70454i("x", "y");

    /* JADX INFO: renamed from: a */
    public static int m62268a(yl60 yl60Var) {
        yl60Var.mo53759a();
        int iMo53765k = (int) (yl60Var.mo53765k() * 255.0d);
        int iMo53765k2 = (int) (yl60Var.mo53765k() * 255.0d);
        int iMo53765k3 = (int) (yl60Var.mo53765k() * 255.0d);
        while (yl60Var.mo53763h()) {
            yl60Var.mo53771x();
        }
        yl60Var.mo53761e();
        return Color.argb(255, iMo53765k, iMo53765k2, iMo53765k3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m62269b(yl60 yl60Var, float f) {
        int iM38547C = edb.m38547C(yl60Var.mo53768p());
        if (iM38547C == 0) {
            yl60Var.mo53759a();
            float fMo53765k = (float) yl60Var.mo53765k();
            float fMo53765k2 = (float) yl60Var.mo53765k();
            while (yl60Var.mo53768p() != 2) {
                yl60Var.mo53771x();
            }
            yl60Var.mo53761e();
            return new PointF(fMo53765k * f, fMo53765k2 * f);
        }
        if (iM38547C != 2) {
            if (iM38547C != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(klh.m56827C(yl60Var.mo53768p())));
            }
            float fMo53765k3 = (float) yl60Var.mo53765k();
            float fMo53765k4 = (float) yl60Var.mo53765k();
            while (yl60Var.mo53763h()) {
                yl60Var.mo53771x();
            }
            return new PointF(fMo53765k3 * f, fMo53765k4 * f);
        }
        yl60Var.mo53760c();
        float fM62271d = 0.0f;
        float fM62271d2 = 0.0f;
        while (yl60Var.mo53763h()) {
            int iMo53769s = yl60Var.mo53769s(f145056a);
            if (iMo53769s == 0) {
                fM62271d = m62271d(yl60Var);
            } else if (iMo53769s != 1) {
                yl60Var.mo53770t();
                yl60Var.mo53771x();
            } else {
                fM62271d2 = m62271d(yl60Var);
            }
        }
        yl60Var.mo53762f();
        return new PointF(fM62271d * f, fM62271d2 * f);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m62270c(yl60 yl60Var, float f) {
        ArrayList arrayList = new ArrayList();
        yl60Var.mo53759a();
        while (yl60Var.mo53768p() == 1) {
            yl60Var.mo53759a();
            arrayList.add(m62269b(yl60Var, f));
            yl60Var.mo53761e();
        }
        yl60Var.mo53761e();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m62271d(yl60 yl60Var) {
        int iMo53768p = yl60Var.mo53768p();
        int iM38547C = edb.m38547C(iMo53768p);
        if (iM38547C != 0) {
            if (iM38547C == 6) {
                return (float) yl60Var.mo53765k();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(klh.m56827C(iMo53768p)));
        }
        yl60Var.mo53759a();
        float fMo53765k = (float) yl60Var.mo53765k();
        while (yl60Var.mo53763h()) {
            yl60Var.mo53771x();
        }
        yl60Var.mo53761e();
        return fMo53765k;
    }
}
