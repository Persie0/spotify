package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class d7h1 extends gbh1 {
    private static final d7h1 zzf;
    private int zzb;
    private long zzd;
    private boolean zze;

    static {
        d7h1 d7h1Var = new d7h1();
        zzf = d7h1Var;
        gbh1.m44223h(d7h1.class, d7h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new d7h1();
        }
        if (i2 == 4) {
            return new g6h1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
