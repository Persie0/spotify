package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class z8h1 extends laf1 {
    private static final z8h1 zze;
    private static volatile obf1 zzf;
    private int zza;
    private s9f1 zzd = s9f1.f206952b;

    static {
        z8h1 z8h1Var = new z8h1();
        zze = z8h1Var;
        laf1.m58546m(z8h1.class, z8h1Var);
    }

    /* JADX INFO: renamed from: A */
    public static z8h1 m95599A() {
        return zze;
    }

    /* JADX INFO: renamed from: B */
    public static obf1 m95600B() {
        return (obf1) zze.mo25248u(7);
    }

    /* JADX INFO: renamed from: y */
    public static z8h1 m95601y(s9f1 s9f1Var, haf1 haf1Var) {
        return (z8h1) laf1.m58549p(zze, s9f1Var, haf1Var);
    }

    /* JADX INFO: renamed from: z */
    public static y8h1 m95602z() {
        return (y8h1) zze.m58556i();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m95603C(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzd = r9f1Var;
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
            return new sbf1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new z8h1();
        }
        if (i2 == 4) {
            return new y8h1(zze);
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
        synchronized (z8h1.class) {
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
    public final int m95604w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m95605x() {
        return this.zzd;
    }
}
