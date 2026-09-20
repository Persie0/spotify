package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mmx0 implements jz8, hej {

    /* JADX INFO: renamed from: a */
    public final r9b0 f145276a;

    /* JADX INFO: renamed from: b */
    public final mz8 f145277b;

    /* JADX INFO: renamed from: c */
    public gh01 f145278c;

    public mmx0(r9b0 r9b0Var, oz8 oz8Var, lmx0 lmx0Var) {
        this.f145276a = r9b0Var;
        mz8 mz8VarMo48914j0 = lmx0Var.m59467b().mo48914j0();
        this.f145277b = mz8VarMo48914j0;
        oz8Var.m68627e(mz8VarMo48914j0);
        mz8VarMo48914j0.m63235a(this);
    }

    /* JADX INFO: renamed from: c */
    public static int m62341c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f145276a.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
    }
}
