package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class v6h1 extends gbh1 {
    private static final v6h1 zze;
    private int zzb;
    private String zzd = "";

    static {
        v6h1 v6h1Var = new v6h1();
        zze = v6h1Var;
        gbh1.m44223h(v6h1.class, v6h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new v6h1();
        }
        if (i2 == 4) {
            return new g6h1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
