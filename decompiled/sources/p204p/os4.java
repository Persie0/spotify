package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class os4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f168727a;

    /* JADX INFO: renamed from: b */
    public final boolean f168728b;

    /* JADX INFO: renamed from: c */
    public final boolean f168729c;

    /* JADX INFO: renamed from: d */
    public final boolean f168730d;

    /* JADX INFO: renamed from: e */
    public final boolean f168731e;

    /* JADX INFO: renamed from: f */
    public final bji f168732f;

    /* JADX INFO: renamed from: g */
    public final wg61 f168733g = new wg61(new zr4(this, 13));

    public os4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f168727a = z;
        this.f168728b = z2;
        this.f168729c = z3;
        this.f168730d = z4;
        this.f168731e = z5;
        this.f168732f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m67702a() {
        os4 os4Var = (os4) this.f168733g.getValue();
        return os4Var != null ? os4Var.m67702a() : this.f168727a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67703b() {
        os4 os4Var = (os4) this.f168733g.getValue();
        return os4Var != null ? os4Var.m67703b() : this.f168728b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67704c() {
        os4 os4Var = (os4) this.f168733g.getValue();
        return os4Var != null ? os4Var.m67704c() : this.f168729c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67705d() {
        os4 os4Var = (os4) this.f168733g.getValue();
        return os4Var != null ? os4Var.m67705d() : this.f168730d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67706e() {
        os4 os4Var = (os4) this.f168733g.getValue();
        return os4Var != null ? os4Var.m67706e() : this.f168731e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_logger_coroutine", "android-ubi-page-bound-ubi-logger", m67702a()), new k8a("enable_page_impression_logger_ai_playlist", "android-ubi-page-bound-ubi-logger", m67703b()), new k8a("enable_page_impression_logger_artist_page", "android-ubi-page-bound-ubi-logger", m67704c()), new k8a("enable_page_impression_logger_artist_releases_page", "android-ubi-page-bound-ubi-logger", m67705d()), new k8a("enable_performance_measurement_for_impressions_v2", "android-ubi-page-bound-ubi-logger", m67706e()));
    }
}
