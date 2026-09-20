package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class egf1 extends laf1 {
    private static final egf1 zzq;
    private static volatile obf1 zzr;
    private int zza;
    private int zzg;
    private boolean zzk;
    private boolean zzl;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";

    static {
        egf1 egf1Var = new egf1();
        zzq = egf1Var;
        laf1.m58546m(egf1.class, egf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static dgf1 m38854w() {
        return (dgf1) zzq.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m38855A(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m38856B(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38857C(String str) {
        this.zzj = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m38858D(boolean z) {
        this.zzk = z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m38859E(boolean z) {
        this.zzl = z;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m38860F(String str) {
        this.zzm = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m38861G(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzn = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m38862H(int i) {
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
            return new sbf1(zzq, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\u0007\u000bȈ\fለ\u0000\rለ\u0001\u000eለ\u0002", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new egf1();
        }
        if (i2 == 4) {
            return new dgf1(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzr;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (egf1.class) {
            try {
                kaf1Var = zzr;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzq);
                    zzr = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m38863x(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m38864y(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m38865z(String str) {
        this.zzf = "18.9.2";
    }
}
