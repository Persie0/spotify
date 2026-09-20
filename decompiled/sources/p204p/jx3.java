package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jx3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f116773a;

    /* JADX INFO: renamed from: b */
    public final boolean f116774b;

    /* JADX INFO: renamed from: c */
    public final boolean f116775c;

    /* JADX INFO: renamed from: d */
    public final boolean f116776d;

    /* JADX INFO: renamed from: e */
    public final boolean f116777e;

    /* JADX INFO: renamed from: f */
    public final bji f116778f;

    /* JADX INFO: renamed from: g */
    public final wg61 f116779g = new wg61(new ju3(this, 23));

    public jx3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f116773a = z;
        this.f116774b = z2;
        this.f116775c = z3;
        this.f116776d = z4;
        this.f116777e = z5;
        this.f116778f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m54487a() {
        jx3 jx3Var = (jx3) this.f116779g.getValue();
        return jx3Var != null ? jx3Var.m54487a() : this.f116773a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54488b() {
        jx3 jx3Var = (jx3) this.f116779g.getValue();
        return jx3Var != null ? jx3Var.m54488b() : this.f116774b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54489c() {
        jx3 jx3Var = (jx3) this.f116779g.getValue();
        return jx3Var != null ? jx3Var.m54489c() : this.f116775c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54490d() {
        jx3 jx3Var = (jx3) this.f116779g.getValue();
        return jx3Var != null ? jx3Var.m54490d() : this.f116776d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54491e() {
        jx3 jx3Var = (jx3) this.f116779g.getValue();
        return jx3Var != null ? jx3Var.m54491e() : this.f116777e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("absolute_clip_position_enabled", "android-betamax-context-player", m54487a()), new k8a("defer_app_start_prepare_enabled", "android-betamax-context-player", m54488b()), new k8a("resume_anchored_pttff_enabled", "android-betamax-context-player", m54489c()), new k8a("stop_ad_player_on_transition_enabled", "android-betamax-context-player", m54490d()), new k8a("video_ads_caching_enabled", "android-betamax-context-player", m54491e()));
    }
}
