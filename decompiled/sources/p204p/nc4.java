package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nc4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f152413a;

    /* JADX INFO: renamed from: b */
    public final boolean f152414b;

    /* JADX INFO: renamed from: c */
    public final boolean f152415c;

    /* JADX INFO: renamed from: d */
    public final boolean f152416d;

    /* JADX INFO: renamed from: e */
    public final boolean f152417e;

    /* JADX INFO: renamed from: f */
    public final boolean f152418f;

    /* JADX INFO: renamed from: g */
    public final int f152419g;

    /* JADX INFO: renamed from: h */
    public final int f152420h;

    /* JADX INFO: renamed from: i */
    public final bji f152421i;

    /* JADX INFO: renamed from: j */
    public final wg61 f152422j;

    public nc4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, bji bjiVar) {
        this.f152413a = z;
        this.f152414b = z2;
        this.f152415c = z3;
        this.f152416d = z4;
        this.f152417e = z5;
        this.f152418f = z6;
        this.f152419g = i;
        this.f152420h = i2;
        this.f152421i = bjiVar;
        this.f152422j = new wg61(new sb4(this, 17));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64109a() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64109a() : this.f152413a;
    }

    /* JADX INFO: renamed from: b */
    public final nc4 m64110b() {
        return (nc4) this.f152422j.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m64111c() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64111c() : this.f152414b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m64112d() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64112d() : this.f152415c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m64113e() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64113e() : this.f152416d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m64114f() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64114f() : this.f152417e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m64115g() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64115g() : this.f152418f;
    }

    /* JADX INFO: renamed from: h */
    public final int m64116h() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64116h() : this.f152419g;
    }

    /* JADX INFO: renamed from: i */
    public final int m64117i() {
        nc4 nc4VarM64110b = m64110b();
        return nc4VarM64110b != null ? nc4VarM64110b.m64117i() : this.f152420h;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("automatically_opt_in_after_message_period", "android-libs-on-demand-trials", m64109a()), new k8a("enable_mini_trial", "android-libs-on-demand-trials", m64111c()), new k8a("enable_one_day_trial_end_message", "android-libs-on-demand-trials", m64112d()), new k8a("enable_opt_in_trials", "android-libs-on-demand-trials", m64113e()), new k8a("enable_trial_signifier_for_audio_quality", "android-libs-on-demand-trials", m64114f()), new k8a("enable_trial_signifiers", "android-libs-on-demand-trials", m64115g()), new k8a("trial_message_period_active_days", "android-libs-on-demand-trials", m64116h(), 0, 100), new k8a("trial_message_period_total_days", "android-libs-on-demand-trials", m64117i(), 0, 100));
    }

    public nc4(bji bjiVar) {
        this(false, false, false, false, false, false, 3, 14, bjiVar);
    }
}
