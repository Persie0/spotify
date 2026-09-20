package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239660a;

    /* JADX INFO: renamed from: b */
    public final boolean f239661b;

    /* JADX INFO: renamed from: c */
    public final boolean f239662c;

    /* JADX INFO: renamed from: d */
    public final bji f239663d;

    /* JADX INFO: renamed from: e */
    public final wg61 f239664e = new wg61(new sb4(this, 25));

    public vc4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f239660a = z;
        this.f239661b = z2;
        this.f239662c = z3;
        this.f239663d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85179a() {
        vc4 vc4Var = (vc4) this.f239664e.getValue();
        return vc4Var != null ? vc4Var.m85179a() : this.f239660a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85180b() {
        vc4 vc4Var = (vc4) this.f239664e.getValue();
        return vc4Var != null ? vc4Var.m85180b() : this.f239661b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85181c() {
        vc4 vc4Var = (vc4) this.f239664e.getValue();
        return vc4Var != null ? vc4Var.m85181c() : this.f239662c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_comments_membership_badge", "android-libs-podcast-interactivity-common", m85179a()), new k8a("show_updated_ui", "android-libs-podcast-interactivity-common", m85180b()), new k8a("use_page_api", "android-libs-podcast-interactivity-common", m85181c()));
    }
}
