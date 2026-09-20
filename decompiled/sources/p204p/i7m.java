package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class i7m implements f7m {

    /* JADX INFO: renamed from: a */
    public final o7m f99582a;

    /* JADX INFO: renamed from: b */
    public final int f99583b;

    /* JADX INFO: renamed from: c */
    public final int f99584c;

    /* JADX INFO: renamed from: d */
    public final m500 f99585d;

    /* JADX INFO: renamed from: e */
    public final l5j0 f99586e;

    /* JADX INFO: renamed from: f */
    public final xoi0 f99587f = new xoi0();

    /* JADX INFO: renamed from: g */
    public final h7m f99588g = new h7m(this, 0);

    public i7m(o7m o7mVar, int i, int i2, m500 m500Var, hc80 hc80Var, ica icaVar, l5j0 l5j0Var) {
        this.f99582a = o7mVar;
        this.f99583b = i;
        this.f99584c = i2;
        this.f99585d = m500Var;
        this.f99586e = l5j0Var;
        ((x0p) icaVar).f256940v.m33099f(hc80Var, new iz0(this, 9));
        hc80Var.getLifecycle().mo31986a(new g7m(this));
    }

    /* JADX INFO: renamed from: b */
    public static final View m49874b(i7m i7mVar, zzq0 zzq0Var) {
        m500 m500Var = i7mVar.f99585d;
        if (zzq0Var instanceof xzq0) {
            return m500Var.findViewById(i7mVar.f99584c);
        }
        return zzq0Var instanceof wzq0 ? new View(m500Var) : m500Var.findViewById(i7mVar.f99583b);
    }

    @Override // p204p.f7m
    /* JADX INFO: renamed from: a */
    public final ck90 mo40979a() {
        return this.f99587f;
    }
}
