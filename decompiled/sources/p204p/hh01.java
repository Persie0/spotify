package p204p;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class hh01 implements t3b1 {

    /* JADX INFO: renamed from: a */
    public static final hh01 f91248a = new hh01();

    /* JADX INFO: renamed from: b */
    public static final po10 f91249b = po10.m70454i("c", "v", "i", "o");

    @Override // p204p.t3b1
    /* JADX INFO: renamed from: f */
    public final Object mo41272f(yl60 yl60Var, float f) {
        if (yl60Var.mo53768p() == 1) {
            yl60Var.mo53759a();
        }
        yl60Var.mo53760c();
        ArrayList arrayListM62270c = null;
        ArrayList arrayListM62270c2 = null;
        ArrayList arrayListM62270c3 = null;
        boolean zMo53764i = false;
        while (yl60Var.mo53763h()) {
            int iMo53769s = yl60Var.mo53769s(f91249b);
            if (iMo53769s == 0) {
                zMo53764i = yl60Var.mo53764i();
            } else if (iMo53769s == 1) {
                arrayListM62270c = mm60.m62270c(yl60Var, f);
            } else if (iMo53769s == 2) {
                arrayListM62270c2 = mm60.m62270c(yl60Var, f);
            } else if (iMo53769s != 3) {
                yl60Var.mo53770t();
                yl60Var.mo53771x();
            } else {
                arrayListM62270c3 = mm60.m62270c(yl60Var, f);
            }
        }
        yl60Var.mo53762f();
        if (yl60Var.mo53768p() == 2) {
            yl60Var.mo53761e();
        }
        if (arrayListM62270c == null || arrayListM62270c2 == null || arrayListM62270c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListM62270c.isEmpty()) {
            return new gh01(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListM62270c.size();
        PointF pointF = (PointF) arrayListM62270c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListM62270c.get(i);
            int i2 = i - 1;
            arrayList.add(new zzl(eff0.m38731a((PointF) arrayListM62270c.get(i2), (PointF) arrayListM62270c3.get(i2)), eff0.m38731a(pointF2, (PointF) arrayListM62270c2.get(i)), pointF2));
        }
        if (zMo53764i) {
            PointF pointF3 = (PointF) arrayListM62270c.get(0);
            int i3 = size - 1;
            arrayList.add(new zzl(eff0.m38731a((PointF) arrayListM62270c.get(i3), (PointF) arrayListM62270c3.get(i3)), eff0.m38731a(pointF3, (PointF) arrayListM62270c2.get(0)), pointF3));
        }
        return new gh01(pointF, zMo53764i, arrayList);
    }
}
