package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f44760a;

    /* JADX INFO: renamed from: b */
    public final boolean f44761b;

    /* JADX INFO: renamed from: c */
    public final boolean f44762c;

    /* JADX INFO: renamed from: d */
    public final bji f44763d;

    /* JADX INFO: renamed from: e */
    public final wg61 f44764e = new wg61(new u14(this, 13));

    public d34(boolean z, boolean z2, boolean z3, bji bjiVar) {
        this.f44760a = z;
        this.f44761b = z2;
        this.f44762c = z3;
        this.f44763d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34802a() {
        d34 d34Var = (d34) this.f44764e.getValue();
        return d34Var != null ? d34Var.m34802a() : this.f44760a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m34803b() {
        d34 d34Var = (d34) this.f44764e.getValue();
        return d34Var != null ? d34Var.m34803b() : this.f44761b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m34804c() {
        d34 d34Var = (d34) this.f44764e.getValue();
        return d34Var != null ? d34Var.m34804c() : this.f44762c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_continuation_cluster", "android-engagesdk-engagecontinuationcluster", m34802a()), new k8a("observe_recently_played", "android-engagesdk-engagecontinuationcluster", m34803b()), new k8a("schedule_on_start", "android-engagesdk-engagecontinuationcluster", m34804c()));
    }
}
