package p204p;

import com.comscore.util.log.LogLevel;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ze90 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281963a;

    /* JADX INFO: renamed from: b */
    public final boolean f281964b;

    /* JADX INFO: renamed from: c */
    public final boolean f281965c;

    /* JADX INFO: renamed from: d */
    public final boolean f281966d;

    /* JADX INFO: renamed from: e */
    public final boolean f281967e;

    /* JADX INFO: renamed from: f */
    public final boolean f281968f;

    /* JADX INFO: renamed from: g */
    public final boolean f281969g;

    /* JADX INFO: renamed from: h */
    public final boolean f281970h;

    /* JADX INFO: renamed from: i */
    public final boolean f281971i;

    /* JADX INFO: renamed from: j */
    public final boolean f281972j;

    /* JADX INFO: renamed from: k */
    public final boolean f281973k;

    /* JADX INFO: renamed from: l */
    public final boolean f281974l;

    /* JADX INFO: renamed from: m */
    public final int f281975m;

    /* JADX INFO: renamed from: n */
    public final boolean f281976n;

    /* JADX INFO: renamed from: o */
    public final boolean f281977o;

    /* JADX INFO: renamed from: p */
    public final fnk0 f281978p;

    /* JADX INFO: renamed from: q */
    public final bji f281979q;

    /* JADX INFO: renamed from: r */
    public final wg61 f281980r = new wg61(new ye90(this, 0));

    /* JADX INFO: renamed from: s */
    public final wg61 f281981s = new wg61(new t790(this, 4));

    public ze90(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, boolean z13, boolean z14, fnk0 fnk0Var, bji bjiVar) {
        this.f281963a = z;
        this.f281964b = z2;
        this.f281965c = z3;
        this.f281966d = z4;
        this.f281967e = z5;
        this.f281968f = z6;
        this.f281969g = z7;
        this.f281970h = z8;
        this.f281971i = z9;
        this.f281972j = z10;
        this.f281973k = z11;
        this.f281974l = z12;
        this.f281975m = i;
        this.f281976n = z13;
        this.f281977o = z14;
        this.f281978p = fnk0Var;
        this.f281979q = bjiVar;
    }

    /* JADX INFO: renamed from: r */
    public static ze90 m95965r(uys0 uys0Var) {
        return new ze90(uys0Var.mo47707c("listening-activity:activity_sharing_with_followers_setting_available", false), uys0Var.mo47707c("listening-activity:activity_sheet_preview_play_enabled", false), uys0Var.mo47707c("listening-activity:activity_sheet_show_play_context", false), uys0Var.mo47707c("listening-activity:carousel_enabled", false), uys0Var.mo47707c("listening-activity:custom_reactions_enabled", false), uys0Var.mo47707c("listening-activity:enable_text_input_detail_sheet", false), uys0Var.mo47707c("listening-activity:following_reactions_enabled", false), uys0Var.mo47707c("listening-activity:hide_user_activity_enabled", false), uys0Var.mo47707c("listening-activity:kodiak_indicators_enabled", false), uys0Var.mo47707c("listening-activity:listening_activity_enabled", false), uys0Var.mo47707c("listening-activity:listening_activity_new_settings_copy_enabled", false), uys0Var.mo47707c("listening-activity:listening_activity_show_onboarding_from_side_drawer", false), uys0Var.mo47706b(1000, LogLevel.NONE, 6000, "listening-activity:poll_interval_ms"), uys0Var.mo47707c("listening-activity:show_view_others_listening_activity_setting", false), uys0Var.mo47707c("listening-activity:visibility_indicator_enabled", false), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m95966a() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95966a() : this.f281963a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95967b() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95967b() : this.f281964b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95968c() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95968c() : this.f281965c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95969d() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95969d() : this.f281966d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95970e() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95970e() : this.f281967e;
    }

    /* JADX INFO: renamed from: f */
    public final ze90 m95971f() {
        return (ze90) this.f281981s.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95972g() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95972g() : this.f281968f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m95973h() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95973h() : this.f281969g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m95974i() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95974i() : this.f281970h;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m95975j() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95975j() : this.f281971i;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m95976k() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95976k() : this.f281972j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m95977l() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95977l() : this.f281973k;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m95978m() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95978m() : this.f281974l;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("activity_sharing_with_followers_setting_available", "listening-activity", m95966a()), new k8a("activity_sheet_preview_play_enabled", "listening-activity", m95967b()), new k8a("activity_sheet_show_play_context", "listening-activity", m95968c()), new k8a("carousel_enabled", "listening-activity", m95969d()), new k8a("custom_reactions_enabled", "listening-activity", m95970e()), new k8a("enable_text_input_detail_sheet", "listening-activity", m95972g()), new k8a("following_reactions_enabled", "listening-activity", m95973h()), new k8a("hide_user_activity_enabled", "listening-activity", m95974i()), new k8a("kodiak_indicators_enabled", "listening-activity", m95975j()), new k8a("listening_activity_enabled", "listening-activity", m95976k()), new k8a("listening_activity_new_settings_copy_enabled", "listening-activity", m95977l()), new k8a("listening_activity_show_onboarding_from_side_drawer", "listening-activity", m95978m()), new k8a("poll_interval_ms", "listening-activity", m95980o(), 1000, LogLevel.NONE), new k8a("show_view_others_listening_activity_setting", "listening-activity", m95981p()), new k8a("visibility_indicator_enabled", "listening-activity", m95982q()));
    }

    /* JADX INFO: renamed from: n */
    public final Observable m95979n() {
        if (this.f281978p != null) {
            Observable observableDistinctUntilChanged = ((Observable) this.f281980r.getValue()).map(gk40.f80714Y0).distinctUntilChanged();
            wj50.m88279p(observableDistinctUntilChanged);
            return observableDistinctUntilChanged;
        }
        Observable observableJust = Observable.just(Boolean.valueOf(this.f281977o));
        wj50.m88279p(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: o */
    public final int m95980o() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95980o() : this.f281975m;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m95981p() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95981p() : this.f281976n;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m95982q() {
        ze90 ze90VarM95971f = m95971f();
        return ze90VarM95971f != null ? ze90VarM95971f.m95982q() : this.f281977o;
    }
}
