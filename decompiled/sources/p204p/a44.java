package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12132a;

    /* JADX INFO: renamed from: b */
    public final boolean f12133b;

    /* JADX INFO: renamed from: c */
    public final boolean f12134c;

    /* JADX INFO: renamed from: d */
    public final bji f12135d;

    /* JADX INFO: renamed from: e */
    public final wg61 f12136e;

    public a44(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f12132a = z;
        this.f12133b = z2;
        this.f12134c = z3;
        this.f12135d = bjiVar;
        this.f12136e = new wg61(new y34(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24659a() {
        a44 a44Var = (a44) this.f12136e.getValue();
        return a44Var != null ? a44Var.m24659a() : this.f12132a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24660b() {
        a44 a44Var = (a44) this.f12136e.getValue();
        return a44Var != null ? a44Var.m24660b() : this.f12134c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24661c() {
        a44 a44Var = (a44) this.f12136e.getValue();
        return a44Var != null ? a44Var.m24661c() : this.f12133b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("context_menu_in_toolbar_trailing_action", "android-feature-audiobook-pre-release", m24659a()), new k8a("is_permission_dialog_on_presave_enabled", "android-feature-audiobook-pre-release", m24661c()), new k8a("should_display_watchfeed_entrypoint", "android-feature-audiobook-pre-release", m24660b()));
    }

    public a44(bji bjiVar) {
        this(false, false, false, bjiVar);
    }
}
