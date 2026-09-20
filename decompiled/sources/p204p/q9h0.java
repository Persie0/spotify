package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class q9h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186595a;

    /* JADX INFO: renamed from: b */
    public final zt91 f186596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w9h0 f186597c;

    public q9h0(w9h0 w9h0Var, int i) {
        this.f186595a = i;
        switch (i) {
            case 1:
                this.f186597c = w9h0Var;
                yt91 yt91VarM96903c = w9h0Var.f249178a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("header_view", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f186596b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f186597c = w9h0Var;
                yt91 yt91VarM96903c2 = w9h0Var.f249178a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("footer_view", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f186596b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f186595a;
        w9h0 w9h0Var = this.f186597c;
        zt91 zt91Var = this.f186596b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = w9h0Var.f249179b.f280780a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = w9h0Var.f249179b.f280780a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }
}
