package p204p;

import android.os.Build;
import java.util.Iterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class tcf1 extends laf1 {
    private static final tcf1 zzj;
    private static volatile obf1 zzk;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private xaf1 zzi = maf1.f141585e;

    static {
        tcf1 tcf1Var = new tcf1();
        zzj = tcf1Var;
        laf1.m58546m(tcf1.class, tcf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static rcf1 m80465w() {
        return (rcf1) zzj.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m80466A(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.zzf = str2;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m80467B(String str) {
        String str2 = Build.MANUFACTURER;
        Objects.requireNonNull(str2);
        this.zzg = str2;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m80468C(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m80469D(Iterable iterable) {
        RandomAccess randomAccess = this.zzi;
        if (!((l9f1) randomAccess).f131083a) {
            maf1 maf1Var = (maf1) randomAccess;
            int i = maf1Var.f141587c;
            this.zzi = maf1Var.zzg(i + i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            scf1 scf1Var = (scf1) it.next();
            xaf1 xaf1Var = this.zzi;
            if (scf1Var == scf1.UNRECOGNIZED) {
                scf1Var.getClass();
                abf1.m25350a();
                throw null;
            }
            ((maf1) xaf1Var).zzh(scf1Var.f207737a);
        }
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
            return new sbf1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new tcf1();
        }
        if (i2 == 4) {
            return new rcf1(zzj);
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
        synchronized (tcf1.class) {
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
    public final /* synthetic */ void m80470x(int i) {
        this.zza = i;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80471y(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80472z(String str) {
        this.zze = "18.9.2";
    }
}
