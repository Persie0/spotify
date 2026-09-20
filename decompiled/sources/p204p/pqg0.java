package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class pqg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f180326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f180327b;

    public pqg0(Integer num, String str, s8g0 s8g0Var) {
        this.f180327b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("managed_account_row", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f180326a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((hog0) this.f180327b.f206644c).f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f180326a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
