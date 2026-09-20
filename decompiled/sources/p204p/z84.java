package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z84 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f280350a;

    /* JADX INFO: renamed from: b */
    public final boolean f280351b;

    /* JADX INFO: renamed from: c */
    public final boolean f280352c;

    /* JADX INFO: renamed from: d */
    public final boolean f280353d;

    /* JADX INFO: renamed from: e */
    public final boolean f280354e;

    /* JADX INFO: renamed from: f */
    public final boolean f280355f;

    /* JADX INFO: renamed from: g */
    public final fnk0 f280356g;

    /* JADX INFO: renamed from: h */
    public final bji f280357h;

    /* JADX INFO: renamed from: i */
    public final wg61 f280358i = new wg61(new f30(this, 14));

    /* JADX INFO: renamed from: j */
    public final wg61 f280359j = new wg61(new f74(this, 19));

    public z84(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, fnk0 fnk0Var, bji bjiVar) {
        this.f280350a = z;
        this.f280351b = z2;
        this.f280352c = z3;
        this.f280353d = z4;
        this.f280354e = z5;
        this.f280355f = z6;
        this.f280356g = fnk0Var;
        this.f280357h = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final z84 m95560a() {
        return (z84) this.f280359j.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95561b() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95561b() : this.f280350a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95562c() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95562c() : this.f280351b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95563d() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95563d() : this.f280352c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m95564e() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95564e() : this.f280353d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m95565f() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95565f() : this.f280354e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m95566g() {
        z84 z84VarM95560a = m95560a();
        return z84VarM95560a != null ? z84VarM95560a.m95566g() : this.f280355f;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_allowlisting_management_enabled", "android-gen-alpha-blocking", m95561b()), new k8a("is_allowlisting_request_enabled", "android-gen-alpha-blocking", m95562c()), new k8a("is_entry_point_artist_enabled", "android-gen-alpha-blocking", m95563d()), new k8a("is_entry_point_track_enabled", "android-gen-alpha-blocking", m95564e()), new k8a("is_managed_account_allowlisting_requests_page_enabled", "android-gen-alpha-blocking", m95565f()), new k8a("is_my_allowlisting_requests_page_enabled", "android-gen-alpha-blocking", m95566g()));
    }
}
