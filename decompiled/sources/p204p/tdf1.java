package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class tdf1 extends laf1 {
    private static final tdf1 zzn;
    private static volatile obf1 zzo;
    private int zza;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzm = "";

    static {
        tdf1 tdf1Var = new tdf1();
        zzn = tdf1Var;
        laf1.m58546m(tdf1.class, tdf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static sdf1 m80506w() {
        return (sdf1) zzn.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m80507A(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m80508B(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m80509C(boolean z) {
        this.zzj = z;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m80510D(boolean z) {
        this.zzk = z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m80511E(String str) {
        this.zzl = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m80512F(String str) {
        Objects.requireNonNull(str);
        this.zza |= 2;
        this.zzm = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m80513G(int i) {
        this.zzg = i - 2;
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
            return new sbf1(zzn, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ለ\u0000\u0006Ȉ\u0007\u0007\b\u0007\tȈ\nለ\u0001", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new tdf1();
        }
        if (i2 == 4) {
            return new sdf1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzo;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (tdf1.class) {
            try {
                kaf1Var = zzo;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzn);
                    zzo = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m80514x(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80515y(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80516z(String str) {
        this.zzf = "18.9.2";
    }
}
