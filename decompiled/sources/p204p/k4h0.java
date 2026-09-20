package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class k4h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f119222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f119223b;

    public k4h0(g4h0 g4h0Var) {
        this.f119223b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recs_search_entrypoint", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f119222a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((m4h0) this.f119223b.f76422c).f139965a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f119222a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
