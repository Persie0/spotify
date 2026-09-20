package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wv4 implements wa81 {

    /* JADX INFO: renamed from: a */
    public static final wv4 f255393a = new wv4();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f255394b = new ConcurrentHashMap();

    @Override // p204p.wa81
    /* JADX INFO: renamed from: c */
    public final void mo53784c(String str, String str2) {
        uv4 uv4Var = (uv4) f255394b.get(new vv4(str, str2));
        if (uv4Var == null || uv4Var.f234333b == 2) {
            return;
        }
        k0e1.m54998r(uv4Var.m84048a(), 0);
        uv4Var.f234333b = 2;
        k0e1.m54990i(uv4Var.m84048a(), 0);
    }

    @Override // p204p.wa81
    /* JADX INFO: renamed from: e */
    public final void mo53785e(int i, String str, String str2) {
        Object objPutIfAbsent;
        vv4 vv4Var = new vv4(str, str2);
        ConcurrentHashMap concurrentHashMap = f255394b;
        Object uv4Var = concurrentHashMap.get(vv4Var);
        if (uv4Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(vv4Var, (uv4Var = new uv4(vv4Var, i)))) != null) {
            uv4Var = objPutIfAbsent;
        }
        k0e1.m54990i(((uv4) uv4Var).m84048a(), 0);
    }

    @Override // p204p.wa81
    /* JADX INFO: renamed from: f */
    public final void mo53786f(String str, String str2) {
        uv4 uv4Var = (uv4) f255394b.remove(new vv4(str, str2));
        if (uv4Var == null) {
            return;
        }
        k0e1.m54998r(uv4Var.m84048a(), 0);
    }
}
