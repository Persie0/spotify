package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pxg1 extends gbh1 {
    private static final pxg1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        pxg1 pxg1Var = new pxg1();
        zzf = pxg1Var;
        gbh1.m44223h(pxg1.class, pxg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static nxg1 m71380m() {
        return (nxg1) zzf.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", oqq0.f168361b1, "zze"});
        }
        if (i2 == 3) {
            return new pxg1();
        }
        if (i2 == 4) {
            return new nxg1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m71381n(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m71382o(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
