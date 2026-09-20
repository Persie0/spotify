package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gff1 extends laf1 {
    private static final gff1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private String zzd = "";
    private s9f1 zze = s9f1.f206952b;

    static {
        gff1 gff1Var = new gff1();
        zzf = gff1Var;
        laf1.m58546m(gff1.class, gff1Var);
    }

    /* JADX INFO: renamed from: y */
    public static gff1 m44615y() {
        return zzf;
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
            return new sbf1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new gff1();
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
        synchronized (gff1.class) {
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
    public final String m44616w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m44617x() {
        return this.zze;
    }
}
