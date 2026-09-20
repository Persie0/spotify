package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f261430a;

    /* JADX INFO: renamed from: b */
    public final boolean f261431b;

    /* JADX INFO: renamed from: c */
    public final boolean f261432c;

    /* JADX INFO: renamed from: d */
    public final boolean f261433d;

    /* JADX INFO: renamed from: e */
    public final boolean f261434e;

    /* JADX INFO: renamed from: f */
    public final bji f261435f;

    /* JADX INFO: renamed from: g */
    public final wg61 f261436g = new wg61(new bh4(this, 13));

    public xh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f261430a = z;
        this.f261431b = z2;
        this.f261432c = z3;
        this.f261433d = z4;
        this.f261434e = z5;
        this.f261435f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90950a() {
        xh4 xh4Var = (xh4) this.f261436g.getValue();
        return xh4Var != null ? xh4Var.m90950a() : this.f261430a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m90951b() {
        xh4 xh4Var = (xh4) this.f261436g.getValue();
        return xh4Var != null ? xh4Var.m90951b() : this.f261431b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90952c() {
        xh4 xh4Var = (xh4) this.f261436g.getValue();
        return xh4Var != null ? xh4Var.m90952c() : this.f261432c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90953d() {
        xh4 xh4Var = (xh4) this.f261436g.getValue();
        return xh4Var != null ? xh4Var.m90953d() : this.f261433d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m90954e() {
        xh4 xh4Var = (xh4) this.f261436g.getValue();
        return xh4Var != null ? xh4Var.m90954e() : this.f261434e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_chaptered_content_fetch_enabled", "android-multitrackmusicvideo-configurationimpl", m90950a()), new k8a("is_chaptered_content_render_enabled", "android-multitrackmusicvideo-configurationimpl", m90951b()), new k8a("is_mft_plus_entity_segments_disable_enabled", "android-multitrackmusicvideo-configurationimpl", m90952c()), new k8a("is_mft_rules_preserved_for_multi_song_content", "android-multitrackmusicvideo-configurationimpl", m90953d()), new k8a("is_multi_song_track_reroute_enabled", "android-multitrackmusicvideo-configurationimpl", m90954e()));
    }
}
