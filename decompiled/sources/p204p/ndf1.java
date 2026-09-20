package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ndf1 extends laf1 {
    private static final ndf1 zzh;
    private static volatile obf1 zzi;
    private int zza;
    private gaf1 zzd;
    private ybf1 zze;
    private gaf1 zzf;
    private ybf1 zzg;

    static {
        ndf1 ndf1Var = new ndf1();
        zzh = ndf1Var;
        laf1.m58546m(ndf1.class, ndf1Var);
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
            return new sbf1(zzh, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ndf1();
        }
        if (i2 == 4) {
            return new pcf1(zzh);
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
        synchronized (ndf1.class) {
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
}
