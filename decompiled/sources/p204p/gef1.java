package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class gef1 extends laf1 {
    private static final gef1 zzs;
    private static volatile obf1 zzt;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private yaf1 zzj = dbf1.f47311e;
    private s9f1 zzk = s9f1.f206952b;
    private kef1 zzl;
    private eef1 zzm;
    private nef1 zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    static {
        gef1 gef1Var = new gef1();
        zzs = gef1Var;
        laf1.m58546m(gef1.class, gef1Var);
    }

    /* JADX INFO: renamed from: H */
    public static gef1 m44472H() {
        return zzs;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m44473A() {
        return (this.zza & 256) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final eef1 m44474B() {
        eef1 eef1Var = this.zzm;
        return eef1Var == null ? eef1.m38654x() : eef1Var;
    }

    /* JADX INFO: renamed from: C */
    public final nef1 m44475C() {
        nef1 nef1Var = this.zzn;
        return nef1Var == null ? nef1.m64260z() : nef1Var;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m44476D() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: E */
    public final long m44477E() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m44478F() {
        return this.zzq;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m44479G() {
        return this.zzr;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m44480I(kef1 kef1Var) {
        this.zzl = kef1Var;
        this.zza |= 128;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m44481J(eef1 eef1Var) {
        this.zzm = eef1Var;
        this.zza |= 256;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m44482K(nef1 nef1Var) {
        Objects.requireNonNull(nef1Var);
        this.zzn = nef1Var;
        this.zza |= 512;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m44483L() {
        this.zzn = null;
        this.zza &= -513;
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
            return new sbf1(zzs, "\u0004\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\u000bဉ\u0007\fဉ\b\rဉ\t\u000eဇ\n\u000fဂ\u000b\u0010ဇ\f\u0011ဇ\r", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new gef1();
        }
        if (i2 == 4) {
            return new fef1(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzt;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (gef1.class) {
            try {
                kaf1Var = zzt;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzs);
                    zzt = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m44484w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final String m44485x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m44486y() {
        return (this.zza & 128) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final kef1 m44487z() {
        kef1 kef1Var = this.zzl;
        return kef1Var == null ? kef1.m56203C() : kef1Var;
    }
}
