package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s34 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f205168a;

    /* JADX INFO: renamed from: b */
    public final int f205169b;

    /* JADX INFO: renamed from: c */
    public final bji f205170c;

    /* JADX INFO: renamed from: d */
    public final wg61 f205171d = new wg61(new u14(this, 24));

    public s34(int i, bji bjiVar, boolean z) {
        this.f205168a = z;
        this.f205169b = i;
        this.f205170c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m77115a() {
        s34 s34Var = (s34) this.f205171d.getValue();
        return s34Var != null ? s34Var.m77115a() : this.f205169b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77116b() {
        s34 s34Var = (s34) this.f205171d.getValue();
        return s34Var != null ? s34Var.m77116b() : this.f205168a;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_age_assurance_reroute_enabled", "android-feature-age-verification", m77116b()), new k8a("social_age_threshold", "android-feature-age-verification", m77115a(), 0, 100));
    }
}
