package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j9h1 extends laf1 {
    private static final j9h1 zzh;
    private static volatile obf1 zzi;
    private int zze;
    private boolean zzf;
    private String zza = "";
    private String zzd = "";
    private String zzg = "";

    static {
        j9h1 j9h1Var = new j9h1();
        zzh = j9h1Var;
        laf1.m58546m(j9h1.class, j9h1Var);
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
            return new sbf1(zzh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new j9h1();
        }
        if (i2 == 4) {
            return new pcf1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzi;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (j9h1.class) {
            try {
                kaf1Var = zzi;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzh);
                    zzi = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
