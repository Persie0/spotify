package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tff1 extends laf1 {
    private static final tff1 zzk;
    private static volatile obf1 zzl;
    private int zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private rff1 zzh;
    private int zzi;
    private cgf1 zzj;

    static {
        tff1 tff1Var = new tff1();
        zzk = tff1Var;
        laf1.m58546m(tff1.class, tff1Var);
    }

    /* JADX INFO: renamed from: w */
    public static sff1 m80666w() {
        return (sff1) zzk.m58556i();
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
            return new sbf1(zzk, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new tff1();
        }
        if (i2 == 4) {
            return new sff1(zzk);
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
        synchronized (tff1.class) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m80667x(int i) {
        this.zzi = i;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80668y(int i) {
        this.zzd = i - 2;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80669z(int i) {
        this.zzf = i - 2;
    }
}
