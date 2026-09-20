package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kx7 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final kx7 f127343a = new kx7();

    /* JADX INFO: renamed from: b */
    public static final guy f127344b = guy.m45792b("eventType");

    /* JADX INFO: renamed from: c */
    public static final guy f127345c = guy.m45792b("sessionData");

    /* JADX INFO: renamed from: d */
    public static final guy f127346d = guy.m45792b("applicationInfo");

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        i001 i001Var = (i001) obj;
        bmk0 bmk0Var = (bmk0) obj2;
        i001Var.getClass();
        bmk0Var.mo29864a(f127344b, z8x.SESSION_START);
        bmk0Var.mo29864a(f127345c, i001Var.f97086a);
        bmk0Var.mo29864a(f127346d, i001Var.f97087b);
    }
}
