package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ls7 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final ls7 f136455a = new ls7();

    /* JADX INFO: renamed from: b */
    public static final guy f136456b = guy.m45792b("baseAddress");

    /* JADX INFO: renamed from: c */
    public static final guy f136457c = guy.m45792b("size");

    /* JADX INFO: renamed from: d */
    public static final guy f136458d = guy.m45792b("name");

    /* JADX INFO: renamed from: e */
    public static final guy f136459e = guy.m45792b("uuid");

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        bmk0 bmk0Var = (bmk0) obj2;
        rz7 rz7Var = (rz7) ((p3l) obj);
        bmk0Var.mo29868e(f136456b, rz7Var.f204077a);
        bmk0Var.mo29868e(f136457c, rz7Var.f204078b);
        bmk0Var.mo29864a(f136458d, rz7Var.f204079c);
        String str = rz7Var.f204080d;
        bmk0Var.mo29864a(f136459e, str != null ? str.getBytes(g4l.f76438a) : null);
    }
}
