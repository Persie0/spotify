package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class o6j extends l6j {

    /* JADX INFO: renamed from: e */
    public ln9 f162352e;

    /* JADX INFO: renamed from: f */
    public int f162353f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f162354g;

    public o6j() {
        super(null);
        this.f162353f = 0;
        this.f162354g = new ArrayList();
    }

    /* JADX INFO: renamed from: i */
    public static fxh0 m66346i(fxh0 fxh0Var, z5j z5jVar, gh00 gh00Var) {
        return fxh0Var.mo34315F(new n6j(z5jVar, gh00Var));
    }

    /* JADX INFO: renamed from: j */
    public final z5j m66347j() {
        int i = this.f162353f;
        this.f162353f = i + 1;
        ArrayList arrayList = this.f162354g;
        z5j z5jVar = (z5j) g6f.m43747t0(i, arrayList);
        if (z5jVar != null) {
            return z5jVar;
        }
        z5j z5jVar2 = new z5j(Integer.valueOf(this.f162353f));
        arrayList.add(z5jVar2);
        return z5jVar2;
    }

    /* JADX INFO: renamed from: k */
    public final ln9 m66348k() {
        ln9 ln9Var = this.f162352e;
        if (ln9Var != null) {
            return ln9Var;
        }
        ln9 ln9Var2 = new ln9(this, 15);
        this.f162352e = ln9Var2;
        return ln9Var2;
    }

    /* JADX INFO: renamed from: l */
    public final void m66349l() {
        this.f130394a.f181673e.clear();
        this.f130397d = this.f130396c;
        this.f130395b = 0;
        this.f162353f = 0;
    }
}
