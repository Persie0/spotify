package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f266267a;

    /* JADX INFO: renamed from: b */
    public final boolean f266268b;

    /* JADX INFO: renamed from: c */
    public final boolean f266269c;

    /* JADX INFO: renamed from: d */
    public final boolean f266270d;

    /* JADX INFO: renamed from: e */
    public final boolean f266271e;

    /* JADX INFO: renamed from: f */
    public final bji f266272f;

    /* JADX INFO: renamed from: g */
    public final wg61 f266273g = new wg61(new uu4(this, 13));

    public xv4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f266267a = z;
        this.f266268b = z2;
        this.f266269c = z3;
        this.f266270d = z4;
        this.f266271e = z5;
        this.f266272f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92211a() {
        xv4 xv4Var = (xv4) this.f266273g.getValue();
        return xv4Var != null ? xv4Var.m92211a() : this.f266267a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92212b() {
        xv4 xv4Var = (xv4) this.f266273g.getValue();
        return xv4Var != null ? xv4Var.m92212b() : this.f266268b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92213c() {
        xv4 xv4Var = (xv4) this.f266273g.getValue();
        return xv4Var != null ? xv4Var.m92213c() : this.f266269c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m92214d() {
        xv4 xv4Var = (xv4) this.f266273g.getValue();
        return xv4Var != null ? xv4Var.m92214d() : this.f266270d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m92215e() {
        xv4 xv4Var = (xv4) this.f266273g.getValue();
        return xv4Var != null ? xv4Var.m92215e() : this.f266271e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("glasses_detection_enabled", "android-xr-glasses", m92211a()), new k8a("glasses_projected_experience_enabled", "android-xr-glasses", m92212b()), new k8a("onboarding_account_linking_nudge_enabled", "android-xr-glasses", m92213c()), new k8a("onboarding_education_enabled", "android-xr-glasses", m92214d()), new k8a("onboarding_session_scoped_dismissals_enabled", "android-xr-glasses", m92215e()));
    }
}
