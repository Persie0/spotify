package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class shg1 extends r3g1 {
    private static final shg1 zzb;
    private int zzd;
    private int zze;

    static {
        shg1 shg1Var = new shg1();
        zzb = shg1Var;
        r3g1.m74640f(shg1.class, shg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static jhg1 m78137p() {
        return (jhg1) zzb.m74650k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m78138q(shg1 shg1Var, int i) {
        shg1Var.zze = i - 1;
        shg1Var.zzd |= 1;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", hxf1.f96221g});
        }
        if (i2 == 3) {
            return new shg1();
        }
        if (i2 == 4) {
            return new jhg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
