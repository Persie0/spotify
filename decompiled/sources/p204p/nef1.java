package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nef1 extends laf1 {
    private static final nef1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private s9f1 zzd;
    private s9f1 zze;
    private boolean zzf;

    static {
        nef1 nef1Var = new nef1();
        zzg = nef1Var;
        laf1.m58546m(nef1.class, nef1Var);
    }

    public nef1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zzd = r9f1Var;
        this.zze = r9f1Var;
    }

    /* JADX INFO: renamed from: z */
    public static nef1 m64260z() {
        return zzg;
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
            return new sbf1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003ဇ\u0000", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new nef1();
        }
        if (i2 == 4) {
            return new pcf1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzh;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (nef1.class) {
            try {
                kaf1Var = zzh;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzg);
                    zzh = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final s9f1 m64261w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m64262x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m64263y() {
        return this.zzf;
    }
}
