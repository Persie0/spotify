package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f259272a;

    /* JADX INFO: renamed from: b */
    public final bji f259273b;

    /* JADX INFO: renamed from: c */
    public final wg61 f259274c = new wg61(new f74(this, 27));

    public x94(boolean z, bji bjiVar) {
        this.f259272a = z;
        this.f259273b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90236a() {
        x94 x94Var = (x94) this.f259274c.getValue();
        return x94Var != null ? x94Var.m90236a() : this.f259272a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("allow_list_access_policy_enabled", "android-inter-app-service", m90236a()));
    }
}
