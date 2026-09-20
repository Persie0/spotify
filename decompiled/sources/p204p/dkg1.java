package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dkg1 extends r3g1 {
    private static final dkg1 zzb;
    private int zzd;
    private int zze;

    static {
        dkg1 dkg1Var = new dkg1();
        zzb = dkg1Var;
        r3g1.m74640f(dkg1.class, dkg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static dkg1 m36308p() {
        return zzb;
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", hxf1.f96223i});
        }
        if (i2 == 3) {
            return new dkg1();
        }
        if (i2 == 4) {
            return new wfg1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
