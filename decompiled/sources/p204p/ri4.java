package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ri4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f199432a;

    /* JADX INFO: renamed from: b */
    public final boolean f199433b;

    /* JADX INFO: renamed from: c */
    public final bji f199434c;

    /* JADX INFO: renamed from: d */
    public final wg61 f199435d = new wg61(new bh4(this, 29));

    public ri4(boolean z, boolean z2, bji bjiVar) {
        this.f199432a = z;
        this.f199433b = z2;
        this.f199434c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75536a() {
        ri4 ri4Var = (ri4) this.f199435d.getValue();
        return ri4Var != null ? ri4Var.m75536a() : this.f199432a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75537b() {
        ri4 ri4Var = (ri4) this.f199435d.getValue();
        return ri4Var != null ? ri4Var.m75537b() : this.f199433b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_notifications_context_menu_page", "android-notificationcenter", m75536a()), new k8a("enable_toolbar_context_menu_page", "android-notificationcenter", m75537b()));
    }
}
