package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class iyg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f106989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cag0 f106990b;

    public iyg0(cag0 cag0Var, String str, String str2, String str3) {
        this.f106990b = cag0Var;
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("trigger_dsa", str, null, str3, str2));
        yt91VarM96903c.f276056j = false;
        this.f106989a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((hog0) this.f106990b.f35817c).f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f106989a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
