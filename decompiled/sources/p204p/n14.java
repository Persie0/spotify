package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final m14 f149289a;

    /* JADX INFO: renamed from: b */
    public final boolean f149290b;

    /* JADX INFO: renamed from: c */
    public final bji f149291c;

    /* JADX INFO: renamed from: d */
    public final wg61 f149292d = new wg61(new ey3(this, 28));

    public n14(m14 m14Var, boolean z, bji bjiVar) {
        this.f149289a = m14Var;
        this.f149290b = z;
        this.f149291c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final m14 m63470a() {
        m14 m14VarM63470a;
        n14 n14Var = (n14) this.f149292d.getValue();
        return (n14Var == null || (m14VarM63470a = n14Var.m63470a()) == null) ? this.f149289a : m14VarM63470a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63471b() {
        n14 n14Var = (n14) this.f149292d.getValue();
        return n14Var != null ? n14Var.m63471b() : this.f149290b;
    }

    @Override // p204p.iys0
    public final List models() {
        String str = m63470a().f138840a;
        m14[] m14VarArrValues = m14.values();
        ArrayList arrayList = new ArrayList(m14VarArrValues.length);
        for (m14 m14Var : m14VarArrValues) {
            arrayList.add(m14Var.f138840a);
        }
        return h6f.m46715L(new k8a("branch_error_level", "android-deeplink-branchintegrationimpl", str, arrayList), new k8a("is_clearing_intent_lock", "android-deeplink-branchintegrationimpl", m63471b()));
    }
}
