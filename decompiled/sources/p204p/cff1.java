package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cff1 extends laf1 {
    private static final cff1 zzo;
    private static volatile obf1 zzp;
    private int zza;
    private long zze;
    private int zzf;
    private s9f1 zzh;
    private String zzi;
    private String zzj;
    private s9f1 zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzd = "";
    private zaf1 zzg = rbf1.f197590e;

    static {
        cff1 cff1Var = new cff1();
        zzo = cff1Var;
        laf1.m58546m(cff1.class, cff1Var);
    }

    public cff1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zzh = r9f1Var;
        this.zzi = "";
        this.zzj = "";
        this.zzk = r9f1Var;
        this.zzl = "";
        this.zzm = "";
        this.zzn = "";
    }

    /* JADX INFO: renamed from: A */
    public static cff1 m32638A() {
        return zzo;
    }

    /* JADX INFO: renamed from: B */
    public final int m32639B() {
        int i;
        int i2 = this.zzf;
        if (i2 == 15) {
            i = 17;
        } else if (i2 != 16) {
            switch (i2) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 18;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
            return new sbf1(zzo, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005\tည\u0006\nለ\u0007\u000bለ\b\fለ\t", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", dff1.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new cff1();
        }
        if (i2 == 4) {
            return new pcf1(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzp;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (cff1.class) {
            try {
                kaf1Var = zzp;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzo);
                    zzp = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final String m32640w() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: x */
    public final zaf1 m32641x() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: y */
    public final s9f1 m32642y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final s9f1 m32643z() {
        return this.zzk;
    }
}
