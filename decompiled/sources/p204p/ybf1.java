package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ybf1 extends laf1 {
    private static final ybf1 zze;
    private static volatile obf1 zzf;
    private long zza;
    private int zzd;

    static {
        ybf1 ybf1Var = new ybf1();
        zze = ybf1Var;
        laf1.m58546m(ybf1.class, ybf1Var);
    }

    /* JADX INFO: renamed from: y */
    public static xbf1 m93259y() {
        return (xbf1) zze.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m93260A(int i) {
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
            return new ybf1();
        }
        if (i2 == 4) {
            return new xbf1(zze);
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
        synchronized (ybf1.class) {
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
    public final long m93261w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final int m93262x() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m93263z(long j) {
        this.zza = j;
    }
}
