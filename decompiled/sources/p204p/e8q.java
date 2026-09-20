package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class e8q extends l19 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c631 f57245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m931 f57246c;

    public /* synthetic */ e8q(m931 m931Var, c631 c631Var, int i) {
        this.f57244a = i;
        this.f57246c = m931Var;
        this.f57245b = c631Var;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [p.gh00, p.qe70] */
    @Override // p204p.l19
    /* JADX INFO: renamed from: a */
    public final void mo30894a(p19 p19Var, int i) {
        switch (this.f57244a) {
            case 0:
                b631 b631Var = ((g631) ((ey9) this.f57246c).f63993d).f76890h;
                if (b631Var != null) {
                    b631Var.mo28256d();
                }
                ArrayList arrayList = this.f57245b.f173003l;
                if (arrayList != null) {
                    arrayList.remove(this);
                    break;
                }
                break;
            default:
                ((qe70) ((m12) this.f57246c).f138799e).invoke(Integer.valueOf(i));
                ArrayList arrayList2 = this.f57245b.f173003l;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                    break;
                }
                break;
        }
    }

    @Override // p204p.l19
    /* JADX INFO: renamed from: b */
    public final void mo30895b(p19 p19Var) {
        switch (this.f57244a) {
            case 0:
                b631 b631Var = ((g631) ((ey9) this.f57246c).f63993d).f76890h;
                if (b631Var != null) {
                    b631Var.mo28255a(this.f57245b);
                }
                break;
            default:
                break;
        }
    }
}
