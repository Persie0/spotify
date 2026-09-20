package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fdf1 extends laf1 {
    private static final fdf1 zzi;
    private static volatile obf1 zzj;
    private String zza = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        fdf1 fdf1Var = new fdf1();
        zzi = fdf1Var;
        laf1.m58546m(fdf1.class, fdf1Var);
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
            return new sbf1(zzi, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new fdf1();
        }
        if (i2 == 4) {
            return new pcf1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzj;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (fdf1.class) {
            try {
                kaf1Var = zzj;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzi);
                    zzj = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
