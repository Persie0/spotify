package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283348a;

    /* JADX INFO: renamed from: b */
    public final boolean f283349b;

    /* JADX INFO: renamed from: c */
    public final boolean f283350c;

    /* JADX INFO: renamed from: d */
    public final bji f283351d;

    /* JADX INFO: renamed from: e */
    public final wg61 f283352e = new wg61(new si4(this, 22));

    public zj4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f283348a = z;
        this.f283349b = z2;
        this.f283350c = z3;
        this.f283351d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96226a() {
        zj4 zj4Var = (zj4) this.f283352e.getValue();
        return zj4Var != null ? zj4Var.m96226a() : this.f283348a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96227b() {
        zj4 zj4Var = (zj4) this.f283352e.getValue();
        return zj4Var != null ? zj4Var.m96227b() : this.f283349b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m96228c() {
        zj4 zj4Var = (zj4) this.f283352e.getValue();
        return zj4Var != null ? zj4Var.m96228c() : this.f283350c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("disable_samsung_now_brief", "android-oem-integrations-samsung", m96226a()), new k8a("samsung_now_brief_use_ai_partner_api", "android-oem-integrations-samsung", m96227b()), new k8a("samsung_s_finder_use_ai_partner_api", "android-oem-integrations-samsung", m96228c()));
    }
}
