package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class udh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f229254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f229255b;

    public udh0(g4h0 g4h0Var) {
        this.f229255b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("algorithm_selection_row", "shuffleAlgorithm", null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f229254a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((vch0) this.f229255b.f76422c).f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f229254a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
