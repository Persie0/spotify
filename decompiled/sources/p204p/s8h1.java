package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class s8h1 extends laf1 {
    private static final s8h1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private int zzd;
    private u8h1 zze;
    private s9f1 zzf = s9f1.f206952b;

    static {
        s8h1 s8h1Var = new s8h1();
        zzg = s8h1Var;
        laf1.m58546m(s8h1.class, s8h1Var);
    }

    /* JADX INFO: renamed from: A */
    public static r8h1 m77501A() {
        return (r8h1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: B */
    public static obf1 m77502B() {
        return (obf1) zzg.mo25248u(7);
    }

    /* JADX INFO: renamed from: z */
    public static s8h1 m77503z(s9f1 s9f1Var, haf1 haf1Var) {
        return (s8h1) laf1.m58549p(zzg, s9f1Var, haf1Var);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m77504C(u8h1 u8h1Var) {
        this.zze = u8h1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m77505D(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzf = r9f1Var;
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
            return new sbf1(zzg, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new s8h1();
        }
        if (i2 == 4) {
            return new r8h1(zzg);
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
        synchronized (s8h1.class) {
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
    public final int m77506w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final u8h1 m77507x() {
        u8h1 u8h1Var = this.zze;
        return u8h1Var == null ? u8h1.m82577C() : u8h1Var;
    }

    /* JADX INFO: renamed from: y */
    public final s9f1 m77508y() {
        return this.zzf;
    }
}
