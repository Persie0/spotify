package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kef1 extends laf1 {
    private static final kef1 zzk;
    private static volatile obf1 zzl;
    private s9f1 zza;
    private String zzd;
    private long zze;
    private s9f1 zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        kef1 kef1Var = new kef1();
        zzk = kef1Var;
        laf1.m58546m(kef1.class, kef1Var);
    }

    public kef1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zza = r9f1Var;
        this.zzd = "";
        this.zzf = r9f1Var;
        this.zzg = "";
        this.zzh = "";
    }

    /* JADX INFO: renamed from: C */
    public static kef1 m56203C() {
        return zzk;
    }

    /* JADX INFO: renamed from: A */
    public final String m56204A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final String m56205B() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m56206D(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m56207E() {
        this.zzd = zzk.zzd;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m56208F(s9f1 s9f1Var) {
        Objects.requireNonNull(s9f1Var);
        this.zzf = s9f1Var;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m56209G() {
        this.zzf = zzk.zzf;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m56210H(String str) {
        Objects.requireNonNull(str);
        this.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m56211I() {
        this.zzg = zzk.zzg;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m56212J(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m56213K() {
        this.zzh = zzk.zzh;
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
            return new sbf1(zzk, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new kef1();
        }
        if (i2 == 4) {
            return new jef1(zzk);
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
        synchronized (kef1.class) {
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

    /* JADX INFO: renamed from: w */
    public final s9f1 m56214w() {
        return this.zza;
    }

    /* JADX INFO: renamed from: x */
    public final String m56215x() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: y */
    public final long m56216y() {
        return this.zze;
    }

    /* JADX INFO: renamed from: z */
    public final s9f1 m56217z() {
        return this.zzf;
    }
}
