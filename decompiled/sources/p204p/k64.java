package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class k64 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f119636a;

    /* JADX INFO: renamed from: b */
    public final boolean f119637b;

    /* JADX INFO: renamed from: c */
    public final boolean f119638c;

    /* JADX INFO: renamed from: d */
    public final boolean f119639d;

    /* JADX INFO: renamed from: e */
    public final bji f119640e;

    /* JADX INFO: renamed from: f */
    public final wg61 f119641f = new wg61(new o54(this, 17));

    public k64(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f119636a = z;
        this.f119637b = z2;
        this.f119638c = z3;
        this.f119639d = z4;
        this.f119640e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55578a() {
        k64 k64Var = (k64) this.f119641f.getValue();
        return k64Var != null ? k64Var.m55578a() : this.f119636a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m55579b() {
        k64 k64Var = (k64) this.f119641f.getValue();
        return k64Var != null ? k64Var.m55579b() : this.f119637b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m55580c() {
        k64 k64Var = (k64) this.f119641f.getValue();
        return k64Var != null ? k64Var.m55580c() : this.f119638c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m55581d() {
        k64 k64Var = (k64) this.f119641f.getValue();
        return k64Var != null ? k64Var.m55581d() : this.f119639d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("listening_party_card_enabled", "android-feature-prerelease", m55578a()), new k8a("push_permission_alert_cdp_album_enabled", "android-feature-prerelease", m55579b()), new k8a("toolbar_context_menu_enabled", "android-feature-prerelease", m55580c()), new k8a("use_album_uri_for_presave", "android-feature-prerelease", m55581d()));
    }
}
