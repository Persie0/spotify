package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ucf1 extends laf1 {
    private static final ucf1 zzk;
    private static volatile obf1 zzl;
    private s9f1 zza;
    private String zzd;
    private s9f1 zze;
    private String zzf;
    private String zzg;
    private s9f1 zzh;
    private String zzi;
    private s9f1 zzj;

    static {
        ucf1 ucf1Var = new ucf1();
        zzk = ucf1Var;
        laf1.m58546m(ucf1.class, ucf1Var);
    }

    public ucf1() {
        r9f1 r9f1Var = s9f1.f206952b;
        this.zza = r9f1Var;
        this.zzd = "";
        this.zze = r9f1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzh = r9f1Var;
        this.zzi = "";
        this.zzj = r9f1Var;
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
            return new sbf1(zzk, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new ucf1();
        }
        if (i2 == 4) {
            return new pcf1(zzk);
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
        synchronized (ucf1.class) {
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
}
