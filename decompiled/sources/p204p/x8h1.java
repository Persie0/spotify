package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class x8h1 extends laf1 {
    private static final x8h1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private int zzd;
    private s9f1 zze = s9f1.f206952b;
    private z8h1 zzf;

    static {
        x8h1 x8h1Var = new x8h1();
        zzg = x8h1Var;
        laf1.m58546m(x8h1.class, x8h1Var);
    }

    /* JADX INFO: renamed from: A */
    public static v8h1 m90205A() {
        return (v8h1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public static obf1 m90206B() {
        return (obf1) zzg.mo25248u(7);
    }

    /* JADX INFO: renamed from: z */
    public static x8h1 m90207z(s9f1 s9f1Var, haf1 haf1Var) {
        return (x8h1) laf1.m58549p(zzg, s9f1Var, haf1Var);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m90208C(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zze = r9f1Var;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m90209D(z8h1 z8h1Var) {
        this.zzf = z8h1Var;
        this.zza |= 1;
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
            return new sbf1(zzg, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new x8h1();
        }
        if (i2 == 4) {
            return new v8h1(zzg);
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
        synchronized (x8h1.class) {
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
    public final int m90210w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m90211x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final z8h1 m90212y() {
        z8h1 z8h1Var = this.zzf;
        return z8h1Var == null ? z8h1.m95599A() : z8h1Var;
    }
}
