package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f213003a;

    /* JADX INFO: renamed from: b */
    public final boolean f213004b;

    /* JADX INFO: renamed from: c */
    public final boolean f213005c;

    /* JADX INFO: renamed from: d */
    public final boolean f213006d;

    /* JADX INFO: renamed from: e */
    public final boolean f213007e;

    /* JADX INFO: renamed from: f */
    public final bji f213008f;

    /* JADX INFO: renamed from: g */
    public final wg61 f213009g = new wg61(new kp4(this, 24));

    public sq4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f213003a = z;
        this.f213004b = z2;
        this.f213005c = z3;
        this.f213006d = z4;
        this.f213007e = z5;
        this.f213008f = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78934a() {
        sq4 sq4Var = (sq4) this.f213009g.getValue();
        return sq4Var != null ? sq4Var.m78934a() : this.f213003a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m78935b() {
        sq4 sq4Var = (sq4) this.f213009g.getValue();
        return sq4Var != null ? sq4Var.m78935b() : this.f213004b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m78936c() {
        sq4 sq4Var = (sq4) this.f213009g.getValue();
        return sq4Var != null ? sq4Var.m78936c() : this.f213005c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m78937d() {
        sq4 sq4Var = (sq4) this.f213009g.getValue();
        return sq4Var != null ? sq4Var.m78937d() : this.f213006d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78938e() {
        sq4 sq4Var = (sq4) this.f213009g.getValue();
        return sq4Var != null ? sq4Var.m78938e() : this.f213007e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("accessory_onboarding_enabled", "android-tap-onboarding", m78934a()), new k8a("jabra_elite_interactive_onboarding_enabled", "android-tap-onboarding", m78935b()), new k8a("oppo_headphones_onboarding_enabled", "android-tap-onboarding", m78936c()), new k8a("sony_headphones_onboarding_enabled", "android-tap-onboarding", m78937d()), new k8a("xiaomi_headphones_onboarding_enabled", "android-tap-onboarding", m78938e()));
    }
}
