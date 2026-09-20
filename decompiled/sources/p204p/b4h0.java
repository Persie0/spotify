package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class b4h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f23360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2h0 f23361b;

    public b4h0(r2h0 r2h0Var) {
        this.f23361b = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("toggle_mix_state_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f23360a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f23361b.f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f23360a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
