package p204p;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class eff0 {

    /* JADX INFO: renamed from: a */
    public static final PointF f59045a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m38731a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m38732b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: c */
    public static int m38733c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* JADX INFO: renamed from: d */
    public static void m38734d(gh01 gh01Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = gh01Var.f79776b;
        ArrayList arrayList = gh01Var.f79775a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = f59045a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            zzl zzlVar = (zzl) arrayList.get(i);
            PointF pointF3 = zzlVar.f288023a;
            PointF pointF4 = zzlVar.f288024b;
            PointF pointF5 = zzlVar.f288025c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (gh01Var.f79777c) {
            path3.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public static float m38735e(float f, float f2, float f3) {
        return edb.m38555d(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: f */
    public static void m38736f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2, nu60 nu60Var) {
        if (lu60Var.m59928b(i, nu60Var.getName())) {
            arrayList.add(lu60Var2.m59927a(nu60Var.getName()).m59933g(nu60Var));
        }
    }
}
