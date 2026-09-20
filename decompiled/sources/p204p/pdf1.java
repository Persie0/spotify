package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class pdf1 extends laf1 {
    private static final pdf1 zzj;
    private static volatile obf1 zzk;
    private int zza;
    private fdf1 zze;
    private tcf1 zzf;
    private gdf1 zzg;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        pdf1 pdf1Var = new pdf1();
        zzj = pdf1Var;
        laf1.m58546m(pdf1.class, pdf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static odf1 m69680w() {
        return (odf1) zzj.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m69681A(String str) {
        this.zzi = str;
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
            return new sbf1(zzj, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new pdf1();
        }
        if (i2 == 4) {
            return new odf1(zzj);
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
        synchronized (pdf1.class) {
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
    public final /* synthetic */ void m69682x(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m69683y(tcf1 tcf1Var) {
        this.zzf = tcf1Var;
        this.zza |= 2;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m69684z(String str) {
        this.zzh = str;
    }
}
