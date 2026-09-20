package p204p;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public interface vbn0 {
    /* JADX INFO: renamed from: b */
    static void m85167b(uk4 uk4Var, tiv0 tiv0Var) {
        if (uk4Var.f231213b == null) {
            uk4Var.f231213b = new RectF();
        }
        RectF rectF = uk4Var.f231213b;
        wj50.m88279p(rectF);
        rectF.set(tiv0Var.f220751a, tiv0Var.f220752b, tiv0Var.f220753c, tiv0Var.f220754d);
        Path path = uk4Var.f231212a;
        RectF rectF2 = uk4Var.f231213b;
        wj50.m88279p(rectF2);
        path.addOval(rectF2, xk4.m91260b(1));
    }

    /* JADX INFO: renamed from: c */
    static void m85168c(vbn0 vbn0Var, tiv0 tiv0Var) {
        uk4 uk4Var = (uk4) vbn0Var;
        uk4Var.getClass();
        float f = tiv0Var.f220751a;
        float f2 = tiv0Var.f220754d;
        float f3 = tiv0Var.f220753c;
        float f4 = tiv0Var.f220752b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            xk4.m91261c("Invalid rectangle, make sure no value is NaN");
        }
        if (uk4Var.f231213b == null) {
            uk4Var.f231213b = new RectF();
        }
        RectF rectF = uk4Var.f231213b;
        wj50.m88279p(rectF);
        rectF.set(f, f4, f3, f2);
        Path path = uk4Var.f231212a;
        RectF rectF2 = uk4Var.f231213b;
        wj50.m88279p(rectF2);
        path.addRect(rectF2, xk4.m91260b(1));
    }
}
