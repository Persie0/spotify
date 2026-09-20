package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class f2h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f65194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f65195b;

    public f2h0(hog0 hog0Var) {
        this.f65195b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("added_by_user_attribution_label", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f65194a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f65195b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f65194a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
