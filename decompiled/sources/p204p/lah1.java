package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class lah1 extends laf1 {
    private static final lah1 zzh;
    private static volatile obf1 zzi;
    private int zza;
    private int zzd;
    private gah1 zze;
    private s9f1 zzf;
    private s9f1 zzg;

    static {
        lah1 lah1Var = new lah1();
        zzh = lah1Var;
        laf1.m58546m(lah1.class, lah1Var);
    }

    public lah1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zzf = r9f1Var;
        this.zzg = r9f1Var;
    }

    /* JADX INFO: renamed from: A */
    public static lah1 m58560A(s9f1 s9f1Var, haf1 haf1Var) {
        return (lah1) laf1.m58549p(zzh, s9f1Var, haf1Var);
    }

    /* JADX INFO: renamed from: B */
    public static kah1 m58561B() {
        return (kah1) zzh.m58556i();
    }

    /* JADX INFO: renamed from: C */
    public static lah1 m58562C() {
        return zzh;
    }

    /* JADX INFO: renamed from: D */
    public static obf1 m58563D() {
        return (obf1) zzh.mo25248u(7);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m58564E(gah1 gah1Var) {
        this.zze = gah1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m58565F(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzf = s9f1Var;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m58566G(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzg = s9f1Var;
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
            return new sbf1(zzh, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new lah1();
        }
        if (i2 == 4) {
            return new kah1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzi;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (lah1.class) {
            try {
                kaf1Var = zzi;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzh);
                    zzi = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final int m58567w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final gah1 m58568x() {
        gah1 gah1Var = this.zze;
        return gah1Var == null ? gah1.m44169y() : gah1Var;
    }

    /* JADX INFO: renamed from: y */
    public final s9f1 m58569y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final s9f1 m58570z() {
        return this.zzg;
    }
}
