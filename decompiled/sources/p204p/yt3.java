package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f275932a;

    /* JADX INFO: renamed from: b */
    public final boolean f275933b;

    /* JADX INFO: renamed from: c */
    public final int f275934c;

    /* JADX INFO: renamed from: d */
    public final boolean f275935d;

    /* JADX INFO: renamed from: e */
    public final boolean f275936e;

    /* JADX INFO: renamed from: f */
    public final boolean f275937f;

    /* JADX INFO: renamed from: g */
    public final boolean f275938g;

    /* JADX INFO: renamed from: h */
    public final boolean f275939h;

    /* JADX INFO: renamed from: i */
    public final int f275940i;

    /* JADX INFO: renamed from: j */
    public final boolean f275941j;

    /* JADX INFO: renamed from: k */
    public final boolean f275942k;

    /* JADX INFO: renamed from: l */
    public final int f275943l;

    /* JADX INFO: renamed from: m */
    public final bji f275944m;

    /* JADX INFO: renamed from: n */
    public final wg61 f275945n = new wg61(new w62(this, 25));

    public yt3(int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, int i4, bji bjiVar) {
        this.f275932a = i;
        this.f275933b = z;
        this.f275934c = i2;
        this.f275935d = z2;
        this.f275936e = z3;
        this.f275937f = z4;
        this.f275938g = z5;
        this.f275939h = z6;
        this.f275940i = i3;
        this.f275941j = z7;
        this.f275942k = z8;
        this.f275943l = i4;
        this.f275944m = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m94583a() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94583a() : this.f275932a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94584b() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94584b() : this.f275933b;
    }

    /* JADX INFO: renamed from: c */
    public final int m94585c() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94585c() : this.f275934c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m94586d() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94586d() : this.f275935d;
    }

    /* JADX INFO: renamed from: e */
    public final yt3 m94587e() {
        return (yt3) this.f275945n.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m94588f() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94588f() : this.f275936e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94589g() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94589g() : this.f275937f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94590h() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94590h() : this.f275938g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m94591i() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94591i() : this.f275939h;
    }

    /* JADX INFO: renamed from: j */
    public final int m94592j() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94592j() : this.f275940i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m94593k() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94593k() : this.f275941j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m94594l() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94594l() : this.f275942k;
    }

    /* JADX INFO: renamed from: m */
    public final int m94595m() {
        yt3 yt3VarM94587e = m94587e();
        return yt3VarM94587e != null ? yt3VarM94587e.m94595m() : this.f275943l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cached_ad_expiration_period_seconds", "android-ad-on-app-open", m94583a(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("core_fetch_enabled", "android-ad-on-app-open", m94584b()), new k8a("core_fetch_read_timeout_ms", "android-ad-on-app-open", m94585c(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("cta_card_enabled", "android-ad-on-app-open", m94586d()), new k8a("eligibility_service_enabled", "android-ad-on-app-open", m94588f()), new k8a("page_enabled", "android-ad-on-app-open", m94589g()), new k8a("page_injection_during_startup_enabled", "android-ad-on-app-open", m94590h()), new k8a("skip_button_enabled", "android-ad-on-app-open", m94591i()), new k8a("skippable_ad_delay_ms", "android-ad-on-app-open", m94592j(), 0, Alert.DURATION_SHOW_INDEFINITELY), new k8a("testing_dismiss_ad_when_video_finishes", "android-ad-on-app-open", m94593k()), new k8a("testing_frequency_capping_enabled", "android-ad-on-app-open", m94594l()), new k8a("video_loading_timeout_ms", "android-ad-on-app-open", m94595m(), 0, Alert.DURATION_SHOW_INDEFINITELY));
    }
}
