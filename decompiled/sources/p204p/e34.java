package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f55610a;

    /* JADX INFO: renamed from: b */
    public final int f55611b;

    /* JADX INFO: renamed from: c */
    public final boolean f55612c;

    /* JADX INFO: renamed from: d */
    public final bji f55613d;

    /* JADX INFO: renamed from: e */
    public final wg61 f55614e;

    public e34(int i, bji bjiVar, boolean z, boolean z2) {
        this.f55610a = z;
        this.f55611b = i;
        this.f55612c = z2;
        this.f55613d = bjiVar;
        this.f55614e = new wg61(new u14(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37617a() {
        e34 e34Var = (e34) this.f55614e.getValue();
        return e34Var != null ? e34Var.m37617a() : this.f55610a;
    }

    /* JADX INFO: renamed from: b */
    public final int m37618b() {
        e34 e34Var = (e34) this.f55614e.getValue();
        return e34Var != null ? e34Var.m37618b() : this.f55611b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37619c() {
        e34 e34Var = (e34) this.f55614e.getValue();
        return e34Var != null ? e34Var.m37619c() : this.f55612c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_recommendations_cluster", "android-engagesdk-engagerecommendationscluster", m37617a()), new k8a("publish_cadence_hours", "android-engagesdk-engagerecommendationscluster", m37618b(), 1, 24), new k8a("schedule_on_start", "android-engagesdk-engagerecommendationscluster", m37619c()));
    }

    public e34(bji bjiVar) {
        this(12, bjiVar, false, false);
    }
}
