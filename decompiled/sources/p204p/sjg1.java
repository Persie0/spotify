package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sjg1 extends r3g1 {
    private static final sjg1 zzb;
    private int zzd;
    private tfg1 zze;
    private long zzf;

    static {
        sjg1 sjg1Var = new sjg1();
        zzb = sjg1Var;
        r3g1.m74640f(sjg1.class, sjg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static mjg1 m78342p() {
        return (mjg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m78343q(sjg1 sjg1Var, tfg1 tfg1Var) {
        sjg1Var.zze = tfg1Var;
        sjg1Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m78344r(sjg1 sjg1Var, long j) {
        sjg1Var.zzd |= 2;
        sjg1Var.zzf = j;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new sjg1();
        }
        if (i2 == 4) {
            return new mjg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
