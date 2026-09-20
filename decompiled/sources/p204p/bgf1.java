package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bgf1 extends laf1 {
    private static final bgf1 zze;
    private static volatile obf1 zzf;
    private zaf1 zza = rbf1.f197590e;
    private int zzd;

    static {
        bgf1 bgf1Var = new bgf1();
        zze = bgf1Var;
        laf1.m58546m(bgf1.class, bgf1Var);
    }

    /* JADX INFO: renamed from: w */
    public static bgf1 m29123w(s9f1 s9f1Var) {
        return (bgf1) laf1.m58548o(zze, s9f1Var);
    }

    /* JADX INFO: renamed from: x */
    public static uff1 m29124x() {
        return (uff1) zze.m58556i();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m29125A(int i) {
        this.zzd = i;
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
            return new sbf1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zza", agf1.class, "zzd"});
        }
        if (i2 == 3) {
            return new bgf1();
        }
        if (i2 == 4) {
            return new uff1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        obf1 obf1Var = zzf;
        if (obf1Var != null) {
            return obf1Var;
        }
        synchronized (bgf1.class) {
            try {
                kaf1Var = zzf;
                if (kaf1Var == null) {
                    kaf1Var = new kaf1(zze);
                    zzf = kaf1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaf1Var;
    }

    /* JADX INFO: renamed from: y */
    public final void m29126y(agf1 agf1Var) {
        zaf1 zaf1Var = this.zza;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zza = zaf1Var.zzg(size + size);
        }
        this.zza.add(agf1Var);
    }

    /* JADX INFO: renamed from: z */
    public final void m29127z(List list) {
        zaf1 zaf1Var = this.zza;
        if (!((l9f1) zaf1Var).f131083a) {
            int size = zaf1Var.size();
            this.zza = zaf1Var.zzg(size + size);
        }
        k9f1.m55796f(list, this.zza);
    }
}
