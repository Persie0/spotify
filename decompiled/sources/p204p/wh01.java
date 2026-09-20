package p204p;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wh01 {

    /* JADX INFO: renamed from: a */
    public float f251216a;

    /* JADX INFO: renamed from: b */
    public float f251217b;

    /* JADX INFO: renamed from: c */
    public float f251218c;

    /* JADX INFO: renamed from: d */
    public float f251219d;

    /* JADX INFO: renamed from: e */
    public float f251220e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f251221f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f251222g = new ArrayList();

    public wh01() {
        m88083d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m88080a(float f) {
        float f2 = this.f251219d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f251217b;
        float f5 = this.f251218c;
        sh01 sh01Var = new sh01(f4, f5, f4, f5);
        sh01Var.f208973f = this.f251219d;
        sh01Var.f208974g = f3;
        this.f251222g.add(new qh01(sh01Var));
        this.f251219d = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m88081b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f251221f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((uh01) arrayList.get(i)).mo78123a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m88082c(float f, float f2) {
        th01 th01Var = new th01();
        th01Var.f220298b = f;
        th01Var.f220299c = f2;
        this.f251221f.add(th01Var);
        rh01 rh01Var = new rh01(th01Var, this.f251217b, this.f251218c);
        float fM75494b = rh01Var.m75494b() + 270.0f;
        float fM75494b2 = rh01Var.m75494b() + 270.0f;
        m88080a(fM75494b);
        this.f251222g.add(rh01Var);
        this.f251219d = fM75494b2;
        this.f251217b = f;
        this.f251218c = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m88083d(float f, float f2, float f3) {
        this.f251216a = f;
        this.f251217b = 0.0f;
        this.f251218c = f;
        this.f251219d = f2;
        this.f251220e = (f2 + f3) % 360.0f;
        this.f251221f.clear();
        this.f251222g.clear();
    }
}
