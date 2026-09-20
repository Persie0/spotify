package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a8f1 extends gbh1 {
    private static final a8f1 zzd;
    private qbh1 zzb = ich1.f100820e;

    static {
        a8f1 a8f1Var = new a8f1();
        zzd = a8f1Var;
        gbh1.m44223h(a8f1.class, a8f1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", b8f1.class});
        }
        if (i2 == 3) {
            return new a8f1();
        }
        if (i2 == 4) {
            return new p7f1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
