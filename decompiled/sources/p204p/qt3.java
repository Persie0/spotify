package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qt3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f192267a;

    /* JADX INFO: renamed from: b */
    public final boolean f192268b;

    /* JADX INFO: renamed from: c */
    public final bji f192269c;

    /* JADX INFO: renamed from: d */
    public final wg61 f192270d;

    public qt3(boolean z, boolean z2, bji bjiVar) {
        this.f192267a = z;
        this.f192268b = z2;
        this.f192269c = bjiVar;
        this.f192270d = new wg61(new w62(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73787a() {
        qt3 qt3Var = (qt3) this.f192270d.getValue();
        return qt3Var != null ? qt3Var.m73787a() : this.f192268b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73788b() {
        qt3 qt3Var = (qt3) this.f192270d.getValue();
        return qt3Var != null ? qt3Var.m73788b() : this.f192267a;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_consumption_tracker_top_up_entry_point_enabled", "android-abp", m73788b()), new k8a("use_get_quota_v1_endpoint", "android-abp", m73787a()));
    }

    public qt3(bji bjiVar) {
        this(false, false, bjiVar);
    }
}
