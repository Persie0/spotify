package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xfz0 extends tux0 {

    /* JADX INFO: renamed from: X */
    public final byte[] f261124X;

    /* JADX INFO: renamed from: Y */
    public final s4b f261125Y;

    /* JADX INFO: renamed from: h */
    public final wfz0 f261126h;

    /* JADX INFO: renamed from: i */
    public final e3b f261127i;

    /* JADX INFO: renamed from: t */
    public final vfz0 f261128t;

    public xfz0(wfz0 wfz0Var, e3b e3bVar, vfz0 vfz0Var, byte[] bArr) {
        this.f261126h = wfz0Var;
        this.f261127i = e3bVar;
        this.f261128t = vfz0Var;
        this.f261124X = bArr;
        this.f261125Y = new s4b(e3bVar, wfz0Var.f250932b, bArr, vfz0Var);
    }

    @Override // p204p.tux0
    /* JADX INFO: renamed from: d */
    public final void mo52711d() {
        this.f261125Y.f205541j = true;
    }

    @Override // p204p.tux0
    /* JADX INFO: renamed from: e */
    public final Object mo52712e() throws Exception {
        this.f261125Y.m77190a();
        vfz0 vfz0Var = this.f261128t;
        if (vfz0Var == null) {
            return null;
        }
        vfz0Var.f241072b++;
        ((g7s) vfz0Var.f241075e).m43926f(vfz0Var.m85385c(), vfz0Var.f241073c, vfz0Var.f241074d);
        return null;
    }
}
