package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class edf1 extends laf1 {
    private static final edf1 zzj;
    private static volatile obf1 zzk;
    private int zze;
    private int zzh;
    private int zzi;
    private String zza = "";
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";

    static {
        edf1 edf1Var = new edf1();
        zzj = edf1Var;
        laf1.m58546m(edf1.class, edf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static vcf1 m38578w() {
        return (vcf1) zzj.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m38579A(int i) {
        this.zzi = i;
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
            return new sbf1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zza", "zze", "zzg", "zzh", "zzd", "zzf", "zzi"});
        }
        if (i2 == 3) {
            return new edf1();
        }
        if (i2 == 4) {
            return new vcf1(zzj);
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
        synchronized (edf1.class) {
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

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m38580x(String str) {
        Objects.requireNonNull(str);
        this.zza = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m38581y(int i) {
        this.zze = i;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m38582z(String str) {
        Objects.requireNonNull(str);
        this.zzg = str;
    }
}
