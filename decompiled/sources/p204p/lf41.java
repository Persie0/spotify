package p204p;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lf41 {

    /* JADX INFO: renamed from: a */
    public static final wg61 f132797a = new wg61(l3b0.f129275Z0);

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f132798b = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    public static final he41 m58838a(String str) {
        if (wl51.m88460J0(str)) {
            return null;
        }
        Set set = ff41.f68906e;
        ff41 ff41VarM44796g = gif1.m44796g(str);
        if (ff41VarM44796g == null) {
            return null;
        }
        kf41 kf41Var = (kf41) f132798b.get();
        if (kf41Var == null) {
            kf41Var = (kf41) f132797a.getValue();
        }
        return kf41Var.f122054a.m39275a(ff41VarM44796g);
    }
}
