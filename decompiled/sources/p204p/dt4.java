package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dt4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f52720a;

    /* JADX INFO: renamed from: b */
    public final boolean f52721b;

    /* JADX INFO: renamed from: c */
    public final boolean f52722c;

    /* JADX INFO: renamed from: d */
    public final bji f52723d;

    /* JADX INFO: renamed from: e */
    public final wg61 f52724e = new wg61(new zr4(this, 18));

    public dt4(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f52720a = z;
        this.f52721b = z2;
        this.f52722c = z3;
        this.f52723d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36802a() {
        dt4 dt4Var = (dt4) this.f52724e.getValue();
        return dt4Var != null ? dt4Var.m36802a() : this.f52720a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36803b() {
        dt4 dt4Var = (dt4) this.f52724e.getValue();
        return dt4Var != null ? dt4Var.m36803b() : this.f52721b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36804c() {
        dt4 dt4Var = (dt4) this.f52724e.getValue();
        return dt4Var != null ? dt4Var.m36804c() : this.f52722c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_record_visible_events", "android-uilogic", m36802a()), new k8a("video_ad_element_v2_enabled", "android-uilogic", m36803b()), new k8a("video_brand_ads_auto_dismiss_enabled", "android-uilogic", m36804c()));
    }
}
