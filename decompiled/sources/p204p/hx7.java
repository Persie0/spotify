package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class hx7 implements amk0 {

    /* JADX INFO: renamed from: a */
    public static final hx7 f96151a = new hx7();

    /* JADX INFO: renamed from: b */
    public static final guy f96152b = guy.m45792b("appId");

    /* JADX INFO: renamed from: c */
    public static final guy f96153c = guy.m45792b("deviceModel");

    /* JADX INFO: renamed from: d */
    public static final guy f96154d = guy.m45792b("sessionSdkVersion");

    /* JADX INFO: renamed from: e */
    public static final guy f96155e = guy.m45792b("osVersion");

    /* JADX INFO: renamed from: f */
    public static final guy f96156f = guy.m45792b("logEnvironment");

    /* JADX INFO: renamed from: g */
    public static final guy f96157g = guy.m45792b("androidAppInfo");

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        kg5 kg5Var = (kg5) obj;
        bmk0 bmk0Var = (bmk0) obj2;
        bmk0Var.mo29864a(f96152b, kg5Var.f122299a);
        bmk0Var.mo29864a(f96153c, Build.MODEL);
        bmk0Var.mo29864a(f96154d, "2.0.1");
        bmk0Var.mo29864a(f96155e, Build.VERSION.RELEASE);
        bmk0Var.mo29864a(f96156f, spa0.LOG_ENVIRONMENT_PROD);
        bmk0Var.mo29864a(f96157g, kg5Var.f122300b);
    }
}
