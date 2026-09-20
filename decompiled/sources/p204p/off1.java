package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class off1 extends laf1 {
    private static final off1 zzl;
    private static volatile obf1 zzm;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private s9f1 zzf;
    private s9f1 zzg;
    private s9f1 zzh;
    private xaf1 zzi;
    private int zzj;
    private int zzk;

    static {
        off1 off1Var = new off1();
        zzl = off1Var;
        laf1.m58546m(off1.class, off1Var);
    }

    public off1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zzf = r9f1Var;
        this.zzg = r9f1Var;
        this.zzh = r9f1Var;
        this.zzi = maf1.f141585e;
    }

    /* JADX INFO: renamed from: C */
    public static mff1 m66819C() {
        return (mff1) zzl.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m66820A() {
        return (this.zza & 4) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final s9f1 m66821B() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m66822D() {
        this.zza &= -2;
        this.zzd = zzl.zzd;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m66823E() {
        this.zza &= -3;
        this.zze = zzl.zze;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m66824F(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 4;
        this.zzf = s9f1Var;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m66825G(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 8;
        this.zzg = s9f1Var;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m66826H(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 16;
        this.zzh = s9f1Var;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m66827I() {
        this.zzj = 2;
        this.zza |= 32;
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
            return new sbf1(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0005\u0005င\u0006\u0006ည\u0002\u0007ည\u0003\bည\u0004", new Object[]{"zza", "zzd", "zze", "zzi", "zzj", nff1.f153344a, "zzk", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new off1();
        }
        if (i2 == 4) {
            return new mff1(zzl);
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
        synchronized (off1.class) {
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
    public final boolean m66828w() {
        return (this.zza & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final String m66829x() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m66830y() {
        return (this.zza & 2) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final String m66831z() {
        return this.zze;
    }
}
