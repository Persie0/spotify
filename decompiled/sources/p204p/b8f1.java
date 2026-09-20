package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class b8f1 extends gbh1 {
    private static final b8f1 zzg;
    private int zzb;
    private long zzd;
    private long zze;
    private int zzf;

    static {
        b8f1 b8f1Var = new b8f1();
        zzg = b8f1Var;
        gbh1.m44223h(b8f1.class, b8f1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new b8f1();
        }
        if (i2 == 4) {
            return new p7f1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
