package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lff1 extends laf1 {
    private static final lff1 zzk;
    private static volatile obf1 zzl;
    private int zza;
    private long zzd;
    private long zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        lff1 lff1Var = new lff1();
        zzk = lff1Var;
        laf1.m58546m(lff1.class, lff1Var);
    }

    /* JADX INFO: renamed from: z */
    public static lff1 m58865z(byte[] bArr) {
        return (lff1) laf1.m58550q(zzk, bArr);
    }

    /* JADX INFO: renamed from: A */
    public final int m58866A() {
        int i = this.zzh;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final int m58867B() {
        int i = this.zzi;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public final int m58868C() {
        int i = this.zzj;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
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
            return new sbf1(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new lff1();
        }
        if (i2 == 4) {
            return new pcf1(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzl;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (lff1.class) {
            try {
                kaf1Var = zzl;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzk);
                    zzl = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final long m58869w() {
        return this.zze;
    }

    /* JADX INFO: renamed from: x */
    public final int m58870x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final long m58871y() {
        return this.zzg;
    }
}
