package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qcf1 extends laf1 {
    private static final qcf1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private gaf1 zzd;
    private int zze;

    static {
        qcf1 qcf1Var = new qcf1();
        zzf = qcf1Var;
        laf1.m58546m(qcf1.class, qcf1Var);
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
            return new sbf1(zzf, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new qcf1();
        }
        if (i2 == 4) {
            return new pcf1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzg;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (qcf1.class) {
            try {
                kaf1Var = zzg;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzf);
                    zzg = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
