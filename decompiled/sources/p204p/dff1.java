package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dff1 extends laf1 {
    private static final dff1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private String zzd = "";
    private String zze = "";

    static {
        dff1 dff1Var = new dff1();
        zzf = dff1Var;
        laf1.m58546m(dff1.class, dff1Var);
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
            return new sbf1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new dff1();
        }
        if (i2 == 4) {
            return new pcf1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzg;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (dff1.class) {
            try {
                kaf1Var = zzg;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzf);
                    zzg = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m35885w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final String m35886x() {
        return this.zze;
    }
}
