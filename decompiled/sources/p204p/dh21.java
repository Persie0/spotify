package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dh21 implements c5y {

    /* JADX INFO: renamed from: a */
    public final int f48962a;

    /* JADX INFO: renamed from: b */
    public final int f48963b;

    /* JADX INFO: renamed from: c */
    public final String f48964c;

    /* JADX INFO: renamed from: d */
    public int f48965d;

    /* JADX INFO: renamed from: e */
    public int f48966e;

    /* JADX INFO: renamed from: f */
    public e5y f48967f;

    /* JADX INFO: renamed from: g */
    public ck81 f48968g;

    public dh21(int i, int i2, String str) {
        this.f48962a = i;
        this.f48963b = i2;
        this.f48964c = str;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        if (j == 0 || this.f48966e == 1) {
            this.f48966e = 1;
            this.f48965d = 0;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        this.f48967f = e5yVar;
        ck81 ck81VarMo37837x = e5yVar.mo37837x(1024, 4);
        this.f48968g = ck81VarMo37837x;
        p300 p300Var = new p300();
        String str = this.f48964c;
        p300Var.f173526n = def0.m35799p(str);
        p300Var.f173527o = def0.m35799p(str);
        t3d1.m80000o(p300Var, ck81VarMo37837x);
        this.f48967f.mo37836t();
        this.f48967f.mo37835d(new jh21());
        this.f48966e = 1;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) {
        int i = this.f48966e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        ck81 ck81Var = this.f48968g;
        ck81Var.getClass();
        int iMo33091e = ck81Var.mo33091e(d5yVar, 1024, true);
        if (iMo33091e != -1) {
            this.f48965d += iMo33091e;
            return 0;
        }
        this.f48966e = 2;
        this.f48968g.mo33088b(0L, 1, this.f48965d, 0, null);
        this.f48965d = 0;
        return 0;
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        int i = this.f48963b;
        int i2 = this.f48962a;
        c95.m31855u((i2 == -1 || i == -1) ? false : true);
        l2n0 l2n0Var = new l2n0(i);
        ((hhp) d5yVar).mo35036c(l2n0Var.f129054a, 0, i, false);
        return l2n0Var.m57924L() == i2;
    }

    @Override // p204p.c5y
    public final void release() {
    }
}
