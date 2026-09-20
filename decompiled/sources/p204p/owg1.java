package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class owg1 extends gbh1 {
    private static final owg1 zzd;
    private qbh1 zzb = ich1.f100820e;

    static {
        owg1 owg1Var = new owg1();
        zzd = owg1Var;
        gbh1.m44223h(owg1.class, owg1Var);
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new owg1();
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
