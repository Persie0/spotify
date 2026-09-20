package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w3h1 extends gbh1 {
    private static final w3h1 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private String zzg = "";
    private String zzj = "";

    static {
        w3h1 w3h1Var = new w3h1();
        zzk = w3h1Var;
        gbh1.m44223h(w3h1.class, w3h1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new w3h1();
        }
        if (i2 == 4) {
            return new o1h1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
