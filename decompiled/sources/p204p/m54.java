package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140088a;

    /* JADX INFO: renamed from: b */
    public final boolean f140089b;

    /* JADX INFO: renamed from: c */
    public final boolean f140090c;

    /* JADX INFO: renamed from: d */
    public final boolean f140091d;

    /* JADX INFO: renamed from: e */
    public final bji f140092e;

    /* JADX INFO: renamed from: f */
    public final wg61 f140093f;

    public m54(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f140088a = z;
        this.f140089b = z2;
        this.f140090c = z3;
        this.f140091d = z4;
        this.f140092e = bjiVar;
        this.f140093f = new wg61(new y34(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m60824a() {
        m54 m54Var = (m54) this.f140093f.getValue();
        return m54Var != null ? m54Var.m60824a() : this.f140088a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m60825b() {
        m54 m54Var = (m54) this.f140093f.getValue();
        return m54Var != null ? m54Var.m60825b() : this.f140089b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m60826c() {
        m54 m54Var = (m54) this.f140093f.getValue();
        return m54Var != null ? m54Var.m60826c() : this.f140090c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m60827d() {
        m54 m54Var = (m54) this.f140093f.getValue();
        return m54Var != null ? m54Var.m60827d() : this.f140091d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("compose_enabled", "android-feature-main-layout", m60824a()), new k8a("large_screen_layout_npv_mode_persistent", "android-feature-main-layout", m60825b()), new k8a("overlay_page_plugin_enabled", "android-feature-main-layout", m60826c()), new k8a("overlay_touch_passthrough_enabled", "android-feature-main-layout", m60827d()));
    }

    public m54(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
