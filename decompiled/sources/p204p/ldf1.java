package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ldf1 extends laf1 {
    private static final ldf1 zzg;
    private static volatile obf1 zzh;
    private int zza;
    private zaf1 zzd;
    private zaf1 zze;
    private ucf1 zzf;

    static {
        ldf1 ldf1Var = new ldf1();
        zzg = ldf1Var;
        laf1.m58546m(ldf1.class, ldf1Var);
    }

    public ldf1() {
        rbf1 rbf1Var = rbf1.f197590e;
        this.zzd = rbf1Var;
        this.zze = rbf1Var;
    }

    /* JADX INFO: renamed from: y */
    public static kdf1 m58737y() {
        return (kdf1) zzg.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final void m58738A(qdf1 qdf1Var) {
        Objects.requireNonNull(qdf1Var);
        zaf1 zaf1Var = this.zze;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zze = zaf1Var.zzg(size + size);
        }
        this.zze.add(qdf1Var);
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
            return new sbf1(zzg, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zza", "zzd", jdf1.class, "zze", qdf1.class, "zzf"});
        }
        if (i2 == 3) {
            return new ldf1();
        }
        if (i2 == 4) {
            return new kdf1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzh;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (ldf1.class) {
            try {
                kaf1Var = zzh;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zzg);
                    zzh = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: w */
    public final int m58739w() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: x */
    public final int m58740x() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: z */
    public final void m58741z(jdf1 jdf1Var) {
        Objects.requireNonNull(jdf1Var);
        zaf1 zaf1Var = this.zzd;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zzd = zaf1Var.zzg(size + size);
        }
        this.zzd.add(jdf1Var);
    }
}
