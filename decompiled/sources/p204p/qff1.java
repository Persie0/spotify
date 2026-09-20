package p204p;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class qff1 extends laf1 {
    private static final qff1 zzf;
    private static volatile obf1 zzg;
    private int zza;
    private String zzd = "";
    private zaf1 zze = rbf1.f197590e;

    static {
        qff1 qff1Var = new qff1();
        zzf = qff1Var;
        laf1.m58546m(qff1.class, qff1Var);
    }

    /* JADX INFO: renamed from: x */
    public static qff1 m72711x(r9f1 r9f1Var) {
        return (qff1) laf1.m58548o(zzf, r9f1Var);
    }

    /* JADX INFO: renamed from: y */
    public static qff1 m72712y(byte[] bArr) {
        return (qff1) laf1.m58550q(zzf, bArr);
    }

    /* JADX INFO: renamed from: z */
    public static pff1 m72713z() {
        return (pff1) zzf.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m72714A(String str) {
        Objects.requireNonNull(str);
        this.zza |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m72715B(off1 off1Var) {
        zaf1 zaf1Var = this.zze;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zze = zaf1Var.zzg(size + size);
        }
        this.zze.add(off1Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m72716C(ArrayList arrayList) {
        zaf1 zaf1Var = this.zze;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zze = zaf1Var.zzg(size + size);
        }
        k9f1.m55796f(arrayList, this.zze);
    }

    /* JADX INFO: renamed from: D */
    public final void m72717D() {
        this.zze = rbf1.f197590e;
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
            return new sbf1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zza", "zze", off1.class, "zzd"});
        }
        if (i2 == 3) {
            return new qff1();
        }
        if (i2 == 4) {
            return new pff1(zzf);
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
        synchronized (qff1.class) {
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

    /* JADX INFO: renamed from: w */
    public final zaf1 m72718w() {
        return this.zze;
    }
}
