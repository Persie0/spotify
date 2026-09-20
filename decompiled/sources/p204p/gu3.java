package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f84361a;

    /* JADX INFO: renamed from: b */
    public final boolean f84362b;

    /* JADX INFO: renamed from: c */
    public final boolean f84363c;

    /* JADX INFO: renamed from: d */
    public final boolean f84364d;

    /* JADX INFO: renamed from: e */
    public final fu3 f84365e;

    /* JADX INFO: renamed from: f */
    public final boolean f84366f;

    /* JADX INFO: renamed from: g */
    public final boolean f84367g;

    /* JADX INFO: renamed from: h */
    public final bji f84368h;

    /* JADX INFO: renamed from: i */
    public final wg61 f84369i;

    public gu3(boolean z, boolean z2, boolean z3, boolean z4, fu3 fu3Var, boolean z5, boolean z6, bji bjiVar) {
        this.f84361a = z;
        this.f84362b = z2;
        this.f84363c = z3;
        this.f84364d = z4;
        this.f84365e = fu3Var;
        this.f84366f = z5;
        this.f84367g = z6;
        this.f84368h = bjiVar;
        this.f84369i = new wg61(new w62(this, 27));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45715a() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45715a() : this.f84361a;
    }

    /* JADX INFO: renamed from: b */
    public final gu3 m45716b() {
        return (gu3) this.f84369i.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m45717c() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45717c() : this.f84362b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m45718d() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45718d() : this.f84363c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m45719e() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45719e() : this.f84364d;
    }

    /* JADX INFO: renamed from: f */
    public final fu3 m45720f() {
        fu3 fu3VarM45720f;
        gu3 gu3VarM45716b = m45716b();
        return (gu3VarM45716b == null || (fu3VarM45720f = gu3VarM45716b.m45720f()) == null) ? this.f84365e : fu3VarM45720f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m45721g() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45721g() : this.f84366f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m45722h() {
        gu3 gu3VarM45716b = m45716b();
        return gu3VarM45716b != null ? gu3VarM45716b.m45722h() : this.f84367g;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("close_ad_npv_enabled", "android-adsdisplay-elementimpl", m45715a());
        k8a k8aVar2 = new k8a("display_ad_viewability_tracker_enabled", "android-adsdisplay-elementimpl", m45717c());
        k8a k8aVar3 = new k8a("show_ad_break_time_remaining", "android-adsdisplay-elementimpl", m45718d());
        k8a k8aVar4 = new k8a("skippable_ad_element_enabled", "android-adsdisplay-elementimpl", m45719e());
        String str = m45720f().f73392a;
        fu3[] fu3VarArrValues = fu3.values();
        ArrayList arrayList = new ArrayList(fu3VarArrValues.length);
        for (fu3 fu3Var : fu3VarArrValues) {
            arrayList.add(fu3Var.f73392a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, new k8a("video_ad_card_click_behavior", "android-adsdisplay-elementimpl", str, arrayList), new k8a("video_ad_element_close_button_enabled", "android-adsdisplay-elementimpl", m45721g()), new k8a("visible_impression_enabled", "android-adsdisplay-elementimpl", m45722h()));
    }

    public gu3(bji bjiVar) {
        this(false, false, true, false, fu3.EXPAND_FULL_VIDEO, false, false, bjiVar);
    }
}
