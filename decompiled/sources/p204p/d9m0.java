package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class d9m0 implements m6d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f46858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f46859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f46860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f46861d;

    public d9m0(float f, float f2, float f3, float f4) {
        this.f46858a = f;
        this.f46859b = f2;
        this.f46860c = f3;
        this.f46861d = f4;
    }

    @Override // p204p.m6d0
    /* JADX INFO: renamed from: a */
    public final n6d0 mo24627a(o6d0 o6d0Var, List list, long j) {
        t5o0 t5o0VarMo39619B = ((h6d0) g6f.m43741q0(list)).mo39619B(j);
        int iM28430i = b8j.m28430i(j);
        int i = iM28430i / 2;
        float f = this.f46858a;
        float fM63436m = 0.0f;
        float f2 = this.f46859b;
        if (f != 0.0f) {
            float f3 = f2 / 2.0f;
            float f4 = (this.f46860c / 2.0f) + f3;
            float f5 = ((iM28430i / 2.0f) - f3) - this.f46861d;
            fM63436m = n0e1.m63436m(Math.signum(f) * edb.m38555d(f5, f4, Math.abs(f), f4), -f5, f5);
        }
        return o6d0Var.mo44714T(iM28430i, t5o0VarMo39619B.f217323b, nau.f152117a, new dy4(t5o0VarMo39619B, (i - ((int) (f2 / 2))) - ((int) fM63436m), 10));
    }
}
