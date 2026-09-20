package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class zkh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f283769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ alh0 f283770b;

    public zkh0(alh0 alh0Var, String str) {
        this.f283770b = alh0Var;
        yt91 yt91VarM96903c = alh0Var.f16887b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("sort_option", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f283769a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f283770b.f16886a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f283769a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
