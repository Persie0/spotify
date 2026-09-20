package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mdf1 extends laf1 {
    private static final mdf1 zzj;
    private static volatile obf1 zzk;
    private int zza;
    private int zzd = 0;
    private Object zze;
    private ndf1 zzf;
    private int zzg;
    private edf1 zzh;
    private hdf1 zzi;

    static {
        mdf1 mdf1Var = new mdf1();
        zzj = mdf1Var;
        laf1.m58546m(mdf1.class, mdf1Var);
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
            return new sbf1(zzj, "\u0000.\u0001\u0001\u0001..\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019ဉ\u0002\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000)?\u0000*?\u0000+?\u0000,?\u0000-?\u0000.?\u0000", new Object[]{"zze", "zzd", "zza", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new mdf1();
        }
        if (i2 == 4) {
            return new pcf1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzk;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (mdf1.class) {
            try {
                kaf1Var = zzk;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzj);
                    zzk = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }
}
