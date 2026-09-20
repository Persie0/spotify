package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f128614a;

    /* JADX INFO: renamed from: b */
    public final boolean f128615b;

    /* JADX INFO: renamed from: c */
    public final int f128616c;

    /* JADX INFO: renamed from: d */
    public final boolean f128617d;

    /* JADX INFO: renamed from: e */
    public final boolean f128618e;

    /* JADX INFO: renamed from: f */
    public final k14 f128619f;

    /* JADX INFO: renamed from: g */
    public final bji f128620g;

    /* JADX INFO: renamed from: h */
    public final wg61 f128621h = new wg61(new ey3(this, 27));

    public l14(boolean z, boolean z2, int i, boolean z3, boolean z4, k14 k14Var, bji bjiVar) {
        this.f128614a = z;
        this.f128615b = z2;
        this.f128616c = i;
        this.f128617d = z3;
        this.f128618e = z4;
        this.f128619f = k14Var;
        this.f128620g = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final l14 m57856a() {
        return (l14) this.f128621h.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57857b() {
        l14 l14VarM57856a = m57856a();
        return l14VarM57856a != null ? l14VarM57856a.m57857b() : this.f128614a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57858c() {
        l14 l14VarM57856a = m57856a();
        return l14VarM57856a != null ? l14VarM57856a.m57858c() : this.f128615b;
    }

    /* JADX INFO: renamed from: d */
    public final int m57859d() {
        l14 l14VarM57856a = m57856a();
        return l14VarM57856a != null ? l14VarM57856a.m57859d() : this.f128616c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m57860e() {
        l14 l14VarM57856a = m57856a();
        return l14VarM57856a != null ? l14VarM57856a.m57860e() : this.f128617d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57861f() {
        l14 l14VarM57856a = m57856a();
        return l14VarM57856a != null ? l14VarM57856a.m57861f() : this.f128618e;
    }

    /* JADX INFO: renamed from: g */
    public final k14 m57862g() {
        k14 k14VarM57862g;
        l14 l14VarM57856a = m57856a();
        return (l14VarM57856a == null || (k14VarM57862g = l14VarM57856a.m57862g()) == null) ? this.f128619f : k14VarM57862g;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("debug_tooling_enabled", "android-decipher", m57857b());
        k8a k8aVar2 = new k8a("enhanced_search_back_navigation_mirroring_enabled", "android-decipher", m57858c());
        k8a k8aVar3 = new k8a("enhanced_search_grace_period_seconds", "android-decipher", m57859d(), 0, 3600);
        k8a k8aVar4 = new k8a("enhanced_search_query_mirroring_enabled", "android-decipher", m57860e());
        k8a k8aVar5 = new k8a("feature_enabled", "android-decipher", m57861f());
        String str = m57862g().f118202a;
        k14[] k14VarArrValues = k14.values();
        ArrayList arrayList = new ArrayList(k14VarArrValues.length);
        for (k14 k14Var : k14VarArrValues) {
            arrayList.add(k14Var.f118202a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, k8aVar4, k8aVar5, new k8a("search_rescue_destination", "android-decipher", str, arrayList));
    }
}
