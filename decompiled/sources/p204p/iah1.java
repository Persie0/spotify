package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class iah1 extends laf1 {
    private static final iah1 zzl;
    private static volatile obf1 zzm;
    private int zza;
    private int zzd;
    private lah1 zze;
    private s9f1 zzf;
    private s9f1 zzg;
    private s9f1 zzh;
    private s9f1 zzi;
    private s9f1 zzj;
    private s9f1 zzk;

    static {
        iah1 iah1Var = new iah1();
        zzl = iah1Var;
        laf1.m58546m(iah1.class, iah1Var);
    }

    public iah1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zzf = r9f1Var;
        this.zzg = r9f1Var;
        this.zzh = r9f1Var;
        this.zzi = r9f1Var;
        this.zzj = r9f1Var;
        this.zzk = r9f1Var;
    }

    /* JADX INFO: renamed from: E */
    public static iah1 m50072E(s9f1 s9f1Var, haf1 haf1Var) {
        return (iah1) laf1.m58549p(zzl, s9f1Var, haf1Var);
    }

    /* JADX INFO: renamed from: F */
    public static hah1 m50073F() {
        return (hah1) zzl.m58556i();
    }

    /* JADX INFO: renamed from: G */
    public static obf1 m50074G() {
        return (obf1) zzl.mo25248u(7);
    }

    /* JADX INFO: renamed from: A */
    public final s9f1 m50075A() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: B */
    public final s9f1 m50076B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: C */
    public final s9f1 m50077C() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: D */
    public final s9f1 m50078D() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m50079H() {
        this.zzd = 0;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m50080I(lah1 lah1Var) {
        this.zze = lah1Var;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m50081J(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzf = s9f1Var;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m50082K(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzg = r9f1Var;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m50083L(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzh = r9f1Var;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50084M(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzi = r9f1Var;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m50085N(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzj = r9f1Var;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m50086O(r9f1 r9f1Var) {
        Objects.requireNonNull(r9f1Var);
        this.zzk = r9f1Var;
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
            return new sbf1(zzl, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new iah1();
        }
        if (i2 == 4) {
            return new hah1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzm;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (iah1.class) {
            try {
                kaf1Var = zzm;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzl);
                    zzm = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final int m50087w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final lah1 m50088x() {
        lah1 lah1Var = this.zze;
        return lah1Var == null ? lah1.m58562C() : lah1Var;
    }

    /* JADX INFO: renamed from: y */
    public final s9f1 m50089y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final s9f1 m50090z() {
        return this.zzg;
    }
}
