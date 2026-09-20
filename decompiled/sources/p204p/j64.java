package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class j64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109212a;

    /* JADX INFO: renamed from: b */
    public final h64 f109213b;

    /* JADX INFO: renamed from: c */
    public final bji f109214c;

    /* JADX INFO: renamed from: d */
    public final wg61 f109215d;

    public j64(boolean z, h64 h64Var, bji bjiVar) {
        this.f109212a = z;
        this.f109213b = h64Var;
        this.f109214c = bjiVar;
        this.f109215d = new wg61(new o54(this, 16));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52509a() {
        j64 j64Var = (j64) this.f109215d.getValue();
        return j64Var != null ? j64Var.m52509a() : this.f109212a;
    }

    /* JADX INFO: renamed from: b */
    public final h64 m52510b() {
        h64 h64VarM52510b;
        j64 j64Var = (j64) this.f109215d.getValue();
        return (j64Var == null || (h64VarM52510b = j64Var.m52510b()) == null) ? this.f109213b : h64VarM52510b;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_premium_banner", "android-feature-premium-banner", m52509a());
        String str = m52510b().f87992a;
        h64[] h64VarArrValues = h64.values();
        ArrayList arrayList = new ArrayList(h64VarArrValues.length);
        for (h64 h64Var : h64VarArrValues) {
            arrayList.add(h64Var.f87992a);
        }
        return h6f.m46715L(k8aVar, new k8a("layout_variant", "android-feature-premium-banner", str, arrayList));
    }

    public j64(bji bjiVar) {
        this(false, h64.TOP_BANNER, bjiVar);
    }
}
