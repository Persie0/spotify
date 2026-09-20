package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tzg1 extends gbh1 {
    private static final tzg1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        tzg1 tzg1Var = new tzg1();
        zzf = tzg1Var;
        gbh1.m44223h(tzg1.class, tzg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static qzg1 m82073m() {
        return (qzg1) zzf.m44227e();
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
            return new tzg1();
        }
        if (i2 == 4) {
            return new qzg1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m82074n(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
