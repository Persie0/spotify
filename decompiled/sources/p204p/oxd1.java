package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxd1 {

    /* JADX INFO: renamed from: a */
    public static final toi0 f170969a;

    /* JADX INFO: renamed from: b */
    public static final mxd1[] f170970b;

    static {
        toi0 toi0Var = new toi0(8);
        mxd1.f148033a.getClass();
        nxd1 nxd1Var = lxd1.f137790g;
        toi0Var.m81201i(1, nxd1Var);
        nxd1 nxd1Var2 = lxd1.f137789f;
        toi0Var.m81201i(2, nxd1Var2);
        nxd1 nxd1Var3 = lxd1.f137785b;
        toi0Var.m81201i(4, nxd1Var3);
        nxd1 nxd1Var4 = lxd1.f137787d;
        toi0Var.m81201i(8, nxd1Var4);
        nxd1 nxd1Var5 = lxd1.f137791h;
        toi0Var.m81201i(16, nxd1Var5);
        nxd1 nxd1Var6 = lxd1.f137788e;
        toi0Var.m81201i(32, nxd1Var6);
        nxd1 nxd1Var7 = lxd1.f137792i;
        toi0Var.m81201i(64, nxd1Var7);
        nxd1 nxd1Var8 = lxd1.f137786c;
        toi0Var.m81201i(128, nxd1Var8);
        f170969a = toi0Var;
        f170970b = new mxd1[]{nxd1Var, nxd1Var2, nxd1Var3, nxd1Var7, nxd1Var5, nxd1Var6, nxd1Var4, lxd1.f137793j, nxd1Var8};
    }

    /* JADX INFO: renamed from: a */
    public static final void m68203a(a3b0 a3b0Var, xiv0 xiv0Var, long j, int i, int i2) {
        if (zfg1.m96020i(j, -1L)) {
            return;
        }
        a3b0Var.m24618a(xiv0Var.mo79381a(), (int) ((j >>> 48) & 65535));
        a3b0Var.m24618a(xiv0Var.mo79382b(), (int) ((j >>> 32) & 65535));
        a3b0Var.m24618a(xiv0Var.mo79384d(), i - ((int) ((j >>> 16) & 65535)));
        a3b0Var.m24618a(xiv0Var.mo79383c(), i2 - ((int) (j & 65535)));
    }
}
