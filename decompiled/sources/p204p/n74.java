package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151066a;

    /* JADX INFO: renamed from: b */
    public final boolean f151067b;

    /* JADX INFO: renamed from: c */
    public final boolean f151068c;

    /* JADX INFO: renamed from: d */
    public final boolean f151069d;

    /* JADX INFO: renamed from: e */
    public final bji f151070e;

    /* JADX INFO: renamed from: f */
    public final wg61 f151071f = new wg61(new f74(this, 7));

    public n74(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f151066a = z;
        this.f151067b = z2;
        this.f151068c = z3;
        this.f151069d = z4;
        this.f151070e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63794a() {
        n74 n74Var = (n74) this.f151071f.getValue();
        return n74Var != null ? n74Var.m63794a() : this.f151066a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63795b() {
        n74 n74Var = (n74) this.f151071f.getValue();
        return n74Var != null ? n74Var.m63795b() : this.f151067b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m63796c() {
        n74 n74Var = (n74) this.f151071f.getValue();
        return n74Var != null ? n74Var.m63796c() : this.f151068c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m63797d() {
        n74 n74Var = (n74) this.f151071f.getValue();
        return n74Var != null ? n74Var.m63797d() : this.f151069d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("campaign_enabled", "android-feature-unboxing-availability-impl", m63794a()), new k8a("marques_icon_enabled", "android-feature-unboxing-availability-impl", m63795b()), new k8a("premium_entry_banner", "android-feature-unboxing-availability-impl", m63796c()), new k8a("premium_entry_modal", "android-feature-unboxing-availability-impl", m63797d()));
    }
}
