package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f249948a;

    /* JADX INFO: renamed from: b */
    public final boolean f249949b;

    /* JADX INFO: renamed from: c */
    public final boolean f249950c;

    /* JADX INFO: renamed from: d */
    public final bji f249951d;

    /* JADX INFO: renamed from: e */
    public final wg61 f249952e = new wg61(new sb4(this, 26));

    public wc4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f249948a = z;
        this.f249949b = z2;
        this.f249950c = z3;
        this.f249951d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87686a() {
        wc4 wc4Var = (wc4) this.f249952e.getValue();
        return wc4Var != null ? wc4Var.m87686a() : this.f249948a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m87687b() {
        wc4 wc4Var = (wc4) this.f249952e.getValue();
        return wc4Var != null ? wc4Var.m87687b() : this.f249949b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m87688c() {
        wc4 wc4Var = (wc4) this.f249952e.getValue();
        return wc4Var != null ? wc4Var.m87688c() : this.f249950c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_podcast_poll_reporting", "android-libs-podcast-interactivity-polls", m87686a()), new k8a("enable_report_flow", "android-libs-podcast-interactivity-polls", m87687b()), new k8a("should_show_polls_feature_in_episode_page", "android-libs-podcast-interactivity-polls", m87688c()));
    }
}
