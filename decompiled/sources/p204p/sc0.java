package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sc0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f207612i = {new spi0(sc0.class, "isSuppressed", "isSuppressed()Z", 0), new spi0(sc0.class, "shouldShow", "getShouldShow()Z", 0), new spi0(sc0.class, "bannerTicket", "getBannerTicket()Lcom/spotify/banner/api/BannerTicket;", 0)};

    /* JADX INFO: renamed from: a */
    public final fv8 f207613a;

    /* JADX INFO: renamed from: b */
    public final uj81 f207614b;

    /* JADX INFO: renamed from: c */
    public final iqp0 f207615c;

    /* JADX INFO: renamed from: d */
    public final red1 f207616d;

    /* JADX INFO: renamed from: e */
    public final iwr f207617e;

    /* JADX INFO: renamed from: f */
    public final oc0 f207618f;

    /* JADX INFO: renamed from: g */
    public final pc0 f207619g;

    /* JADX INFO: renamed from: h */
    public final qc0 f207620h;

    public sc0(tc0 tc0Var, fv8 fv8Var, uj81 uj81Var, iqp0 iqp0Var, red1 red1Var) {
        this.f207613a = fv8Var;
        this.f207614b = uj81Var;
        this.f207615c = iqp0Var;
        this.f207616d = red1Var;
        new gg5(1);
        this.f207617e = new iwr();
        this.f207618f = new oc0(this);
        this.f207619g = new pc0(this);
        this.f207620h = new qc0(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m77759a(sc0 sc0Var) {
        pc0 pc0Var = sc0Var.f207619g;
        qr60[] qr60VarArr = f207612i;
        qr60 qr60Var = qr60VarArr[1];
        if (((Boolean) pc0Var.f61172a).booleanValue()) {
            oc0 oc0Var = sc0Var.f207618f;
            qr60 qr60Var2 = qr60VarArr[0];
            if (!((Boolean) oc0Var.f61172a).booleanValue()) {
                qc0 qc0Var = sc0Var.f207620h;
                qr60 qr60Var3 = qr60VarArr[2];
                if (((cw8) qc0Var.f61172a) == null) {
                    sc0Var.m77760b(sc0Var.f207613a.m42774b(new wt8(new qgj0(sc0Var, 4), null, null, new rc0(sc0Var, 1), ut8.f233840a, 470), true, ure0.f233341a));
                    return;
                }
                return;
            }
        }
        sc0Var.m77760b(null);
    }

    /* JADX INFO: renamed from: b */
    public final void m77760b(fw8 fw8Var) {
        this.f207620h.m39516c(f207612i[2], this, fw8Var);
    }
}
