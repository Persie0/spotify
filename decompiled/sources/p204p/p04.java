package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class p04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f172478a;

    /* JADX INFO: renamed from: b */
    public final boolean f172479b;

    /* JADX INFO: renamed from: c */
    public final boolean f172480c;

    /* JADX INFO: renamed from: d */
    public final bji f172481d;

    /* JADX INFO: renamed from: e */
    public final wg61 f172482e;

    public p04(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f172478a = z;
        this.f172479b = z2;
        this.f172480c = z3;
        this.f172481d = bjiVar;
        this.f172482e = new wg61(new ey3(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68682a() {
        p04 p04Var = (p04) this.f172482e.getValue();
        return p04Var != null ? p04Var.m68682a() : this.f172478a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68683b() {
        p04 p04Var = (p04) this.f172482e.getValue();
        return p04Var != null ? p04Var.m68683b() : this.f172479b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m68684c() {
        p04 p04Var = (p04) this.f172482e.getValue();
        return p04Var != null ? p04Var.m68684c() : this.f172480c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_3_day_countdown_override", "android-content-windowing-flags", m68682a()), new k8a("enable_content_windowing_experience", "android-content-windowing-flags", m68683b()), new k8a("enable_track_preview_upsell", "android-content-windowing-flags", m68684c()));
    }

    public p04(bji bjiVar) {
        this(false, false, false, bjiVar);
    }
}
