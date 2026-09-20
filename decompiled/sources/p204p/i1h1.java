package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i1h1 extends gbh1 {
    private static final i1h1 zze;
    private int zzb;
    private int zzd;

    static {
        i1h1 i1h1Var = new i1h1();
        zze = i1h1Var;
        gbh1.m44223h(i1h1.class, i1h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzd", qgr0.f188536X0});
        }
        if (i2 == 3) {
            return new i1h1();
        }
        if (i2 == 4) {
            return new p7f1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
