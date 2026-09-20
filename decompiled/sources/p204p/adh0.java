package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class adh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f14628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bdh0 f14629b;

    public adh0(bdh0 bdh0Var, String str, Integer num) {
        this.f14629b = bdh0Var;
        yt91 yt91VarM96903c = bdh0Var.f26110b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("ad_category_row", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f14628a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f14629b.f26109a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f14628a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
