package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197434a;

    /* JADX INFO: renamed from: b */
    public final boolean f197435b;

    /* JADX INFO: renamed from: c */
    public final boolean f197436c;

    /* JADX INFO: renamed from: d */
    public final boolean f197437d;

    /* JADX INFO: renamed from: e */
    public final boolean f197438e;

    /* JADX INFO: renamed from: f */
    public final bji f197439f;

    /* JADX INFO: renamed from: g */
    public final wg61 f197440g = new wg61(new ga4(this, 29));

    public rb4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f197434a = z;
        this.f197435b = z2;
        this.f197436c = z3;
        this.f197437d = z4;
        this.f197438e = z5;
        this.f197439f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75132a() {
        rb4 rb4Var = (rb4) this.f197440g.getValue();
        return rb4Var != null ? rb4Var.m75132a() : this.f197434a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m75133b() {
        rb4 rb4Var = (rb4) this.f197440g.getValue();
        return rb4Var != null ? rb4Var.m75133b() : this.f197435b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75134c() {
        rb4 rb4Var = (rb4) this.f197440g.getValue();
        return rb4Var != null ? rb4Var.m75134c() : this.f197436c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m75135d() {
        rb4 rb4Var = (rb4) this.f197440g.getValue();
        return rb4Var != null ? rb4Var.m75135d() : this.f197437d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m75136e() {
        rb4 rb4Var = (rb4) this.f197440g.getValue();
        return rb4Var != null ? rb4Var.m75136e() : this.f197438e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("compose_elements_enabled", "android-libs-nowplaying-ads-mode", m75132a()), new k8a("in_stream_overflow_enabled", "android-libs-nowplaying-ads-mode", m75133b()), new k8a("instream_feedback_v2_enabled", "android-libs-nowplaying-ads-mode", m75134c()), new k8a("landscape_mode_npv_enabled", "android-libs-nowplaying-ads-mode", m75135d()), new k8a("screenshot_detection_enabled", "android-libs-nowplaying-ads-mode", m75136e()));
    }
}
