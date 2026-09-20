package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ta4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f218449a;

    /* JADX INFO: renamed from: b */
    public final boolean f218450b;

    /* JADX INFO: renamed from: c */
    public final boolean f218451c;

    /* JADX INFO: renamed from: d */
    public final boolean f218452d;

    /* JADX INFO: renamed from: e */
    public final bji f218453e;

    /* JADX INFO: renamed from: f */
    public final wg61 f218454f = new wg61(new ga4(this, 10));

    public ta4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f218449a = z;
        this.f218450b = z2;
        this.f218451c = z3;
        this.f218452d = z4;
        this.f218453e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80330a() {
        ta4 ta4Var = (ta4) this.f218454f.getValue();
        return ta4Var != null ? ta4Var.m80330a() : this.f218449a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80331b() {
        ta4 ta4Var = (ta4) this.f218454f.getValue();
        return ta4Var != null ? ta4Var.m80331b() : this.f218450b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80332c() {
        ta4 ta4Var = (ta4) this.f218454f.getValue();
        return ta4Var != null ? ta4Var.m80332c() : this.f218451c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m80333d() {
        ta4 ta4Var = (ta4) this.f218454f.getValue();
        return ta4Var != null ? ta4Var.m80333d() : this.f218452d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("add_to_blend_enabled", "android-libs-blend", m80330a()), new k8a("hide_from_blend_enabled", "android-libs-blend", m80331b()), new k8a("remove_from_blend_enabled", "android-libs-blend", m80332c()), new k8a("social_prompting_enabled", "android-libs-blend", m80333d()));
    }
}
