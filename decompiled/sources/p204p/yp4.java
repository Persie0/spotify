package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274811a;

    /* JADX INFO: renamed from: b */
    public final boolean f274812b;

    /* JADX INFO: renamed from: c */
    public final boolean f274813c;

    /* JADX INFO: renamed from: d */
    public final boolean f274814d;

    /* JADX INFO: renamed from: e */
    public final bji f274815e;

    /* JADX INFO: renamed from: f */
    public final wg61 f274816f = new wg61(new kp4(this, 10));

    public yp4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f274811a = z;
        this.f274812b = z2;
        this.f274813c = z3;
        this.f274814d = z4;
        this.f274815e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94293a() {
        yp4 yp4Var = (yp4) this.f274816f.getValue();
        return yp4Var != null ? yp4Var.m94293a() : this.f274811a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94294b() {
        yp4 yp4Var = (yp4) this.f274816f.getValue();
        return yp4Var != null ? yp4Var.m94294b() : this.f274812b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m94295c() {
        yp4 yp4Var = (yp4) this.f274816f.getValue();
        return yp4Var != null ? yp4Var.m94295c() : this.f274813c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94296d() {
        yp4 yp4Var = (yp4) this.f274816f.getValue();
        return yp4Var != null ? yp4Var.m94296d() : this.f274814d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_animation", "android-system-home-followfeed", m94293a()), new k8a("enable_compose_release_row_element", "android-system-home-followfeed", m94294b()), new k8a("enable_episode_imagery", "android-system-home-followfeed", m94295c()), new k8a("enable_video_thumbnail", "android-system-home-followfeed", m94296d()));
    }
}
