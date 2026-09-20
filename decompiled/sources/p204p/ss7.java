package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ss7 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final ss7 f213502a = new ss7();

    /* JADX INFO: renamed from: b */
    public static final guy f213503b = guy.m45792b("batteryLevel");

    /* JADX INFO: renamed from: c */
    public static final guy f213504c = guy.m45792b("batteryVelocity");

    /* JADX INFO: renamed from: d */
    public static final guy f213505d = guy.m45792b("proximityOn");

    /* JADX INFO: renamed from: e */
    public static final guy f213506e = guy.m45792b("orientation");

    /* JADX INFO: renamed from: f */
    public static final guy f213507f = guy.m45792b("ramUsed");

    /* JADX INFO: renamed from: g */
    public static final guy f213508g = guy.m45792b("diskUsed");

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        bmk0 bmk0Var = (bmk0) obj2;
        d08 d08Var = (d08) ((x3l) obj);
        bmk0Var.mo29864a(f213503b, d08Var.f43798a);
        bmk0Var.mo29866c(f213504c, d08Var.f43799b);
        bmk0Var.mo29867d(f213505d, d08Var.f43800c);
        bmk0Var.mo29866c(f213506e, d08Var.f43801d);
        bmk0Var.mo29868e(f213507f, d08Var.f43802e);
        bmk0Var.mo29868e(f213508g, d08Var.f43803f);
    }
}
