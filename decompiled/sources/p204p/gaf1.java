package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gaf1 extends laf1 {
    private static final gaf1 zze;
    private static volatile obf1 zzf;
    private long zza;
    private int zzd;

    static {
        gaf1 gaf1Var = new gaf1();
        zze = gaf1Var;
        laf1.m58546m(gaf1.class, gaf1Var);
    }

    /* JADX INFO: renamed from: y */
    public static faf1 m44159y() {
        return (faf1) zze.m58556i();
    }

    /* JADX INFO: renamed from: z */
    public static gaf1 m44160z() {
        return zze;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m44161A(long j) {
        this.zza = j;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m44162B(int i) {
        this.zzd = i;
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
            return new sbf1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new gaf1();
        }
        if (i2 == 4) {
            return new faf1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzf;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (gaf1.class) {
            try {
                kaf1Var = zzf;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zze);
                    zzf = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final long m44163w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final int m44164x() {
        return this.zzd;
    }
}
