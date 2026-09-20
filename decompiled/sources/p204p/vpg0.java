package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vpg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f243689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xpg0 f243690b;

    public vpg0(xpg0 xpg0Var, int i) {
        String str;
        this.f243690b = xpg0Var;
        yt91 yt91VarM96903c = xpg0Var.f264634b.m96903c();
        if (i == 1) {
            str = "allowed";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "blocked";
        }
        yt91VarM96903c.f276055i.add(new bu91("add_to_list_button", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f243689a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f243690b.f264633a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f243689a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
