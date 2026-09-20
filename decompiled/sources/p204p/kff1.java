package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kff1 extends laf1 {
    private static final kff1 zze;
    private static volatile obf1 zzf;
    private s9f1 zza;
    private s9f1 zzd;

    static {
        kff1 kff1Var = new kff1();
        zze = kff1Var;
        laf1.m58546m(kff1.class, kff1Var);
    }

    public kff1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zza = r9f1Var;
        this.zzd = r9f1Var;
    }

    /* JADX INFO: renamed from: y */
    public static jff1 m56262y() {
        return (jff1) zze.m58556i();
    }

    /* JADX INFO: renamed from: z */
    public static kff1 m56263z() {
        return zze;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m56264A(s9f1 s9f1Var) {
        this.zza = s9f1Var;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m56265B(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzd = s9f1Var;
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
            return new sbf1(zze, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\n", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new kff1();
        }
        if (i2 == 4) {
            return new jff1(zze);
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
        synchronized (kff1.class) {
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
    public final s9f1 m56266w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m56267x() {
        return this.zzd;
    }
}
