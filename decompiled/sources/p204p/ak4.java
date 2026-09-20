package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ak4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16429a;

    /* JADX INFO: renamed from: b */
    public final boolean f16430b;

    /* JADX INFO: renamed from: c */
    public final wy91 f16431c;

    /* JADX INFO: renamed from: d */
    public final wg61 f16432d = new wg61(new si4(this, 23));

    public ak4(boolean z, boolean z2, wy91 wy91Var) {
        this.f16429a = z;
        this.f16430b = z2;
        this.f16431c = wy91Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26192a() {
        ak4 ak4Var = (ak4) this.f16432d.getValue();
        return ak4Var != null ? ak4Var.m26192a() : this.f16429a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26193b() {
        ak4 ak4Var = (ak4) this.f16432d.getValue();
        return ak4Var != null ? ak4Var.m26193b() : this.f16430b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("force_s_finder_to_use_hydrogen_search", "android-oem-integrations-samsung-unauth-properties-service", m26192a()), new k8a("s_finder_enable_unauth_search", "android-oem-integrations-samsung-unauth-properties-service", m26193b()));
    }
}
