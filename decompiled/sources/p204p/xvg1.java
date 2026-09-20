package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xvg1 extends gbh1 {
    private static final xvg1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        xvg1 xvg1Var = new xvg1();
        zzf = xvg1Var;
        gbh1.m44223h(xvg1.class, xvg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static uvg1 m92235m() {
        return (uvg1) zzf.m44227e();
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new xvg1();
        }
        if (i2 == 4) {
            return new uvg1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m92236n(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m92237o(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }
}
