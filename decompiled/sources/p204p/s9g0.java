package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class s9g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f206955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t9g0 f206956b;

    public s9g0(t9g0 t9g0Var) {
        this.f206956b = t9g0Var;
        yt91 yt91VarM96903c = t9g0Var.f218293c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206955a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f206956b.f218292b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f206955a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
