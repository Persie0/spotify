package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class aef1 extends laf1 {
    private static final aef1 zzi;
    private static volatile obf1 zzj;
    private int zza;
    private String zzd = "";
    private s9f1 zze;
    private String zzf;
    private String zzg;
    private s9f1 zzh;

    static {
        aef1 aef1Var = new aef1();
        zzi = aef1Var;
        laf1.m58546m(aef1.class, aef1Var);
    }

    public aef1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zze = r9f1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzh = r9f1Var;
    }

    /* JADX INFO: renamed from: B */
    public static vdf1 m25721B() {
        return (vdf1) zzi.m58556i();
    }

    /* JADX INFO: renamed from: C */
    public static obf1 m25722C() {
        return (obf1) zzi.mo25248u(7);
    }

    /* JADX INFO: renamed from: A */
    public final s9f1 m25723A() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m25724D(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m25725E(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 2;
        this.zze = s9f1Var;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m25726F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m25727G(String str) {
        Objects.requireNonNull(str);
        this.zza |= 8;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m25728H(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zza |= 16;
        this.zzh = s9f1Var;
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
            return new sbf1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ည\u0004", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new aef1();
        }
        if (i2 == 4) {
            return new vdf1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzj;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (aef1.class) {
            try {
                kaf1Var = zzj;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzi);
                    zzj = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m25729w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final s9f1 m25730x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final String m25731y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final String m25732z() {
        return this.zzg;
    }
}
