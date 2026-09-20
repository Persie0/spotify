package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class udf1 extends laf1 {
    private static final udf1 zze;
    private static volatile obf1 zzf;
    private int zza;
    private qff1 zzd;

    static {
        udf1 udf1Var = new udf1();
        zze = udf1Var;
        laf1.m58546m(udf1.class, udf1Var);
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
            return new sbf1(zze, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzd"});
        }
        if (i2 == 3) {
            return new udf1();
        }
        if (i2 == 4) {
            return new pcf1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzf;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (udf1.class) {
            try {
                kaf1Var = zzf;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zze);
                    zzf = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
