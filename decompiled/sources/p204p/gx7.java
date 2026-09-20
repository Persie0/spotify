package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class gx7 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final gx7 f85202a = new gx7();

    /* JADX INFO: renamed from: b */
    public static final guy f85203b = guy.m45792b(kyx.f127930a);

    /* JADX INFO: renamed from: c */
    public static final guy f85204c = guy.m45792b("versionName");

    /* JADX INFO: renamed from: d */
    public static final guy f85205d = guy.m45792b("appBuildVersion");

    /* JADX INFO: renamed from: e */
    public static final guy f85206e = guy.m45792b("deviceManufacturer");

    /* JADX INFO: renamed from: f */
    public static final guy f85207f = guy.m45792b("currentProcessDetails");

    /* JADX INFO: renamed from: g */
    public static final guy f85208g = guy.m45792b("appProcessDetails");

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        vu3 vu3Var = (vu3) obj;
        bmk0 bmk0Var = (bmk0) obj2;
        bmk0Var.mo29864a(f85203b, vu3Var.f244853a);
        bmk0Var.mo29864a(f85204c, vu3Var.f244854b);
        bmk0Var.mo29864a(f85205d, vu3Var.f244855c);
        bmk0Var.mo29864a(f85206e, Build.MANUFACTURER);
        bmk0Var.mo29864a(f85207f, vu3Var.f244856d);
        bmk0Var.mo29864a(f85208g, vu3Var.f244857e);
    }
}
