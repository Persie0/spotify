package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class su4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213991a;

    /* JADX INFO: renamed from: b */
    public final boolean f213992b;

    /* JADX INFO: renamed from: c */
    public final boolean f213993c;

    /* JADX INFO: renamed from: d */
    public final boolean f213994d;

    /* JADX INFO: renamed from: e */
    public final bji f213995e;

    /* JADX INFO: renamed from: f */
    public final wg61 f213996f;

    public su4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f213991a = z;
        this.f213992b = z2;
        this.f213993c = z3;
        this.f213994d = z4;
        this.f213995e = bjiVar;
        this.f213996f = new wg61(new zr4(this, 28));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79377a() {
        su4 su4Var = (su4) this.f213996f.getValue();
        return su4Var != null ? su4Var.m79377a() : this.f213991a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m79378b() {
        su4 su4Var = (su4) this.f213996f.getValue();
        return su4Var != null ? su4Var.m79378b() : this.f213992b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m79379c() {
        su4 su4Var = (su4) this.f213996f.getValue();
        return su4Var != null ? su4Var.m79379c() : this.f213993c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m79380d() {
        su4 su4Var = (su4) this.f213996f.getValue();
        return su4Var != null ? su4Var.m79380d() : this.f213994d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_time_measurements", "android-watchfeed-carousel", m79377a()), new k8a("enabled_delayed_video_playback", "android-watchfeed-carousel", m79378b()), new k8a("load_video_when_focused", "android-watchfeed-carousel", m79379c()), new k8a("npv_scroll_watchfeed_carousel_entrypoint_enabled", "android-watchfeed-carousel", m79380d()));
    }

    public su4(bji bjiVar) {
        this(false, false, false, false, bjiVar);
    }
}
