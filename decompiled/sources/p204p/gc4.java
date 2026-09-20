package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78477a;

    /* JADX INFO: renamed from: b */
    public final boolean f78478b;

    /* JADX INFO: renamed from: c */
    public final boolean f78479c;

    /* JADX INFO: renamed from: d */
    public final boolean f78480d;

    /* JADX INFO: renamed from: e */
    public final boolean f78481e;

    /* JADX INFO: renamed from: f */
    public final bji f78482f;

    /* JADX INFO: renamed from: g */
    public final wg61 f78483g = new wg61(new sb4(this, 12));

    public gc4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f78477a = z;
        this.f78478b = z2;
        this.f78479c = z3;
        this.f78480d = z4;
        this.f78481e = z5;
        this.f78482f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44284a() {
        gc4 gc4Var = (gc4) this.f78483g.getValue();
        return gc4Var != null ? gc4Var.m44284a() : this.f78477a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44285b() {
        gc4 gc4Var = (gc4) this.f78483g.getValue();
        return gc4Var != null ? gc4Var.m44285b() : this.f78478b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44286c() {
        gc4 gc4Var = (gc4) this.f78483g.getValue();
        return gc4Var != null ? gc4Var.m44286c() : this.f78479c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m44287d() {
        gc4 gc4Var = (gc4) this.f78483g.getValue();
        return gc4Var != null ? gc4Var.m44287d() : this.f78480d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m44288e() {
        gc4 gc4Var = (gc4) this.f78483g.getValue();
        return gc4Var != null ? gc4Var.m44288e() : this.f78481e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("backskip_upsell_bottom_sheet_enabled", "android-libs-nowplaying-reinvent-free-mode", m44284a()), new k8a("disable_suggested_tracks_upsell", "android-libs-nowplaying-reinvent-free-mode", m44285b()), new k8a("enable_playback_control_switcher", "android-libs-nowplaying-reinvent-free-mode", m44286c()), new k8a("seekbar_upsell_bottom_sheet_enabled", "android-libs-nowplaying-reinvent-free-mode", m44287d()), new k8a("skip_next_feedback_enabled", "android-libs-nowplaying-reinvent-free-mode", m44288e()));
    }
}
