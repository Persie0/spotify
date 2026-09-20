package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class agh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f15374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cgh0 f15375b;

    public agh0(cgh0 cgh0Var) {
        this.f15375b = cgh0Var;
        yt91 yt91VarM96903c = cgh0Var.f37666b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("sleep_at_end_of_track", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f15374a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f15375b.f37665a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f15374a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
