package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ou3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170156a;

    /* JADX INFO: renamed from: b */
    public final boolean f170157b;

    /* JADX INFO: renamed from: c */
    public final bji f170158c;

    /* JADX INFO: renamed from: d */
    public final wg61 f170159d = new wg61(new ju3(this, 4));

    public ou3(boolean z, boolean z2, bji bjiVar) {
        this.f170156a = z;
        this.f170157b = z2;
        this.f170158c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68083a() {
        ou3 ou3Var = (ou3) this.f170159d.getValue();
        return ou3Var != null ? ou3Var.m68083a() : this.f170156a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68084b() {
        ou3 ou3Var = (ou3) this.f170159d.getValue();
        return ou3Var != null ? ou3Var.m68084b() : this.f170157b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_handler", "android-aipartner-naturallanguageurihandler", m68083a()), new k8a("enable_interceptor", "android-aipartner-naturallanguageurihandler", m68084b()));
    }
}
