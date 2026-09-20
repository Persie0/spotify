package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bgg1 extends r3g1 {
    private static final bgg1 zzb;

    static {
        bgg1 bgg1Var = new bgg1();
        zzb = bgg1Var;
        r3g1.m74640f(bgg1.class, bgg1Var);
    }

    /* JADX INFO: renamed from: p */
    public static bgg1 m29131p() {
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
            return new t9g1(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new bgg1();
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
