package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f121600a;

    /* JADX INFO: renamed from: b */
    public final boolean f121601b;

    /* JADX INFO: renamed from: c */
    public final boolean f121602c;

    /* JADX INFO: renamed from: d */
    public final bji f121603d;

    /* JADX INFO: renamed from: e */
    public final wg61 f121604e = new wg61(new dd4(this, 4));

    public kd4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f121600a = z;
        this.f121601b = z2;
        this.f121602c = z3;
        this.f121603d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56156a() {
        kd4 kd4Var = (kd4) this.f121604e.getValue();
        return kd4Var != null ? kd4Var.m56156a() : this.f121600a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56157b() {
        kd4 kd4Var = (kd4) this.f121604e.getValue();
        return kd4Var != null ? kd4Var.m56157b() : this.f121601b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56158c() {
        kd4 kd4Var = (kd4) this.f121604e.getValue();
        return kd4Var != null ? kd4Var.m56158c() : this.f121602c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("use_page_api_context_menu", "android-list-platform-contextmenuimpl", m56156a()), new k8a("use_suspend_header_provider", "android-list-platform-contextmenuimpl", m56157b()), new k8a("use_suspend_item_provider", "android-list-platform-contextmenuimpl", m56158c()));
    }
}
