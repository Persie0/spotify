package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f56272a;

    /* JADX INFO: renamed from: b */
    public final boolean f56273b;

    /* JADX INFO: renamed from: c */
    public final bji f56274c;

    /* JADX INFO: renamed from: d */
    public final wg61 f56275d = new wg61(new y34(this, 22));

    public e54(boolean z, boolean z2, bji bjiVar) {
        this.f56272a = z;
        this.f56273b = z2;
        this.f56274c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37802a() {
        e54 e54Var = (e54) this.f56275d.getValue();
        return e54Var != null ? e54Var.m37802a() : this.f56272a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37803b() {
        e54 e54Var = (e54) this.f56275d.getValue();
        return e54Var != null ? e54Var.m37803b() : this.f56273b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("server_driven_lock_requires_local_churn_lock_check", "android-feature-lockstate-detection", m37802a()), new k8a("use_server_driven_lock_state", "android-feature-lockstate-detection", m37803b()));
    }
}
