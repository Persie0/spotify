package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class gj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f80361a;

    /* JADX INFO: renamed from: b */
    public final boolean f80362b;

    /* JADX INFO: renamed from: c */
    public final boolean f80363c;

    /* JADX INFO: renamed from: d */
    public final bji f80364d;

    /* JADX INFO: renamed from: e */
    public final wg61 f80365e = new wg61(new si4(this, 13));

    public gj4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f80361a = z;
        this.f80362b = z2;
        this.f80363c = z3;
        this.f80364d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44865a() {
        gj4 gj4Var = (gj4) this.f80365e.getValue();
        return gj4Var != null ? gj4Var.m44865a() : this.f80361a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m44866b() {
        gj4 gj4Var = (gj4) this.f80365e.getValue();
        return gj4Var != null ? gj4Var.m44866b() : this.f80362b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44867c() {
        gj4 gj4Var = (gj4) this.f80365e.getValue();
        return gj4Var != null ? gj4Var.m44867c() : this.f80363c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("floating_skip_ahead_button", "android-nowplaying-pagetemplate", m44865a()), new k8a("mixing_transition_enabled", "android-nowplaying-pagetemplate", m44866b()), new k8a("podcast_video_captions_button_enabled", "android-nowplaying-pagetemplate", m44867c()));
    }
}
