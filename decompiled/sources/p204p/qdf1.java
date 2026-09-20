package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qdf1 extends laf1 {
    private static final qdf1 zzm;
    private static volatile obf1 zzn;
    private int zza;
    private int zzd;
    private int zze;
    private gaf1 zzh;
    private ybf1 zzi;
    private int zzj;
    private hdf1 zzk;
    private String zzf = "";
    private String zzg = "";
    private zaf1 zzl = rbf1.f197590e;

    static {
        qdf1 qdf1Var = new qdf1();
        zzm = qdf1Var;
        laf1.m58546m(qdf1.class, qdf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static qdf1 m72594w() {
        return zzm;
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
            return new sbf1(zzm, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zza", "zzd", "zzh", "zzi", "zzj", "zzl", mdf1.class, "zze", "zzf", "zzg", "zzk"});
        }
        if (i2 == 3) {
            return new qdf1();
        }
        if (i2 == 4) {
            return new pcf1(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzn;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (qdf1.class) {
            try {
                kaf1Var = zzn;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzm);
                    zzn = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
