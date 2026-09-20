package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iwg1 extends gbh1 {
    private static final iwg1 zzs;
    private int zzb;
    private tzg1 zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private h5h1 zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;

    static {
        iwg1 iwg1Var = new iwg1();
        zzs = iwg1Var;
        gbh1.m44223h(iwg1.class, iwg1Var);
    }

    /* JADX INFO: renamed from: m */
    public static fwg1 m51824m() {
        return (fwg1) zzs.m44227e();
    }

    /* JADX INFO: renamed from: n */
    public static fwg1 m51825n(iwg1 iwg1Var) {
        ebh1 ebh1VarM44227e = zzs.m44227e();
        gbh1 gbh1Var = ebh1VarM44227e.f57939a;
        if (!gbh1Var.equals(iwg1Var)) {
            if (!ebh1VarM44227e.f57940b.m44229k()) {
                gbh1 gbh1Var2 = (gbh1) gbh1Var.mo24628j(4, null);
                hch1.f89793c.m47121a(gbh1Var2.getClass()).mo32259b(gbh1Var2, ebh1VarM44227e.f57940b);
                ebh1VarM44227e.f57940b = gbh1Var2;
            }
            gbh1 gbh1Var3 = ebh1VarM44227e.f57940b;
            hch1.f89793c.m47121a(gbh1Var3.getClass()).mo32259b(gbh1Var3, iwg1Var);
        }
        return (fwg1) ebh1VarM44227e;
    }

    /* JADX INFO: renamed from: o */
    public static iwg1 m51826o() {
        return zzs;
    }

    @Override // p204p.gbh1
    /* JADX INFO: renamed from: j */
    public final Object mo24628j(int i, gbh1 gbh1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jch1(zzs, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", unq0.f232236a1, "zzi", tnq0.f222040a1, "zzj", "zzk", "zzl", "zzm", kxq0.f127568Z0, "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new iwg1();
        }
        if (i2 == 4) {
            return new fwg1(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m51827p(tzg1 tzg1Var) {
        this.zzd = tzg1Var;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m51828q(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m51829r(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m51830s(int i) {
        this.zzb |= 64;
        this.zzj = i;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m51831t(int i) {
        this.zzb |= 128;
        this.zzk = i;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m51832u(int i) {
        this.zzb |= 1024;
        this.zzn = i;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m51833v(boolean z) {
        this.zzb |= 2048;
        this.zzo = z;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m51834w() {
        this.zzb |= 4096;
        this.zzp = 0;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m51835x() {
        this.zzb |= 8192;
        this.zzq = 101;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m51836y(boolean z) {
        this.zzb |= 16384;
        this.zzr = z;
    }
}
