package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class lqg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f136042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f136043b;

    public lqg0(hog0 hog0Var, int i) {
        String str;
        this.f136043b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        if (i == 1) {
            str = "empty_search_input";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "no_results";
        }
        yt91VarM96903c.f276055i.add(new bu91("empty_view", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f136042a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f136043b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f136042a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f136042a;
        nu91Var.f248108b = this.f136043b.f93537b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
