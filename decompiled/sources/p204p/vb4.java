package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239392a;

    /* JADX INFO: renamed from: b */
    public final boolean f239393b;

    /* JADX INFO: renamed from: c */
    public final boolean f239394c;

    /* JADX INFO: renamed from: d */
    public final boolean f239395d;

    /* JADX INFO: renamed from: e */
    public final boolean f239396e;

    /* JADX INFO: renamed from: f */
    public final bji f239397f;

    /* JADX INFO: renamed from: g */
    public final wg61 f239398g;

    public vb4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f239392a = z;
        this.f239393b = z2;
        this.f239394c = z3;
        this.f239395d = z4;
        this.f239396e = z5;
        this.f239397f = bjiVar;
        this.f239398g = new wg61(new sb4(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85106a() {
        vb4 vb4Var = (vb4) this.f239398g.getValue();
        return vb4Var != null ? vb4Var.m85106a() : this.f239392a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85107b() {
        vb4 vb4Var = (vb4) this.f239398g.getValue();
        return vb4Var != null ? vb4Var.m85107b() : this.f239393b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85108c() {
        vb4 vb4Var = (vb4) this.f239398g.getValue();
        return vb4Var != null ? vb4Var.m85108c() : this.f239394c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m85109d() {
        vb4 vb4Var = (vb4) this.f239398g.getValue();
        return vb4Var != null ? vb4Var.m85109d() : this.f239395d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85110e() {
        vb4 vb4Var = (vb4) this.f239398g.getValue();
        return vb4Var != null ? vb4Var.m85110e() : this.f239396e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("allow_in_feedback_context", "android-libs-nowplaying-elements-audiovideotransition", m85106a()), new k8a("allow_in_free_tier", "android-libs-nowplaying-elements-audiovideotransition", m85107b()), new k8a("audio_switch_button_animated_for_music_videos", "android-libs-nowplaying-elements-audiovideotransition", m85108c()), new k8a("is_managed_account_setting_enabled", "android-libs-nowplaying-elements-audiovideotransition", m85109d()), new k8a("is_video_manifest_prefetch_restart_enabled", "android-libs-nowplaying-elements-audiovideotransition", m85110e()));
    }

    public vb4(bji bjiVar) {
        this(false, false, false, false, false, bjiVar);
    }
}
