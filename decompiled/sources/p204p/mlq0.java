package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mlq0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f144902a;

    /* JADX INFO: renamed from: b */
    public final boolean f144903b;

    /* JADX INFO: renamed from: c */
    public final boolean f144904c;

    /* JADX INFO: renamed from: d */
    public final llq0 f144905d;

    /* JADX INFO: renamed from: e */
    public final bji f144906e;

    /* JADX INFO: renamed from: f */
    public final wg61 f144907f = new wg61(new fyo0(this, 24));

    public mlq0(boolean z, boolean z2, boolean z3, llq0 llq0Var, bji bjiVar) {
        this.f144902a = z;
        this.f144903b = z2;
        this.f144904c = z3;
        this.f144905d = llq0Var;
        this.f144906e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62239a() {
        mlq0 mlq0Var = (mlq0) this.f144907f.getValue();
        return mlq0Var != null ? mlq0Var.m62239a() : this.f144902a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m62240b() {
        mlq0 mlq0Var = (mlq0) this.f144907f.getValue();
        return mlq0Var != null ? mlq0Var.m62240b() : this.f144903b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m62241c() {
        mlq0 mlq0Var = (mlq0) this.f144907f.getValue();
        return mlq0Var != null ? mlq0Var.m62241c() : this.f144904c;
    }

    /* JADX INFO: renamed from: d */
    public final llq0 m62242d() {
        llq0 llq0VarM62242d;
        mlq0 mlq0Var = (mlq0) this.f144907f.getValue();
        return (mlq0Var == null || (llq0VarM62242d = mlq0Var.m62242d()) == null) ? this.f144905d : llq0VarM62242d;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("enable_premium_marketing", "premium-destination", m62239a());
        k8a k8aVar2 = new k8a("premium_tab_enabled", "premium-destination", m62240b());
        k8a k8aVar3 = new k8a("premium_tab_shows_on_tablets", "premium-destination", m62241c());
        String str = m62242d().f134688a;
        llq0[] llq0VarArrValues = llq0.values();
        ArrayList arrayList = new ArrayList(llq0VarArrValues.length);
        for (llq0 llq0Var : llq0VarArrValues) {
            arrayList.add(llq0Var.f134688a);
        }
        return h6f.m46715L(k8aVar, k8aVar2, k8aVar3, new k8a("premium_tab_title", "premium-destination", str, arrayList));
    }
}
