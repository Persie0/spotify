package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hdf1 extends laf1 {
    private static final hdf1 zzj;
    private static volatile obf1 zzk;
    private int zza;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzd = "";
    private String zzf = "";
    private String zzh = "";

    static {
        hdf1 hdf1Var = new hdf1();
        zzj = hdf1Var;
        laf1.m58546m(hdf1.class, hdf1Var);
    }

    @Override // p204p.laf1
    /* JADX INFO: renamed from: u */
    public final Object mo25248u(int i) {
        obf1 kaf1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new sbf1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new hdf1();
        }
        if (i2 == 4) {
            return new pcf1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzk;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (hdf1.class) {
            try {
                kaf1Var = zzk;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzj);
                    zzk = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
