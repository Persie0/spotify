package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class gqg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f83471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqg0 f83472b;

    public gqg0(hqg0 hqg0Var) {
        this.f83472b = hqg0Var;
        yt91 yt91VarM96903c = hqg0Var.f94179b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("plus_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f83471a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f83472b.f94178a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f83471a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
