package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class hcg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f89786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zm8 f89787b;

    public hcg0(zm8 zm8Var, String str) {
        this.f89787b = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("ban_button", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f89786a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f89787b.f284179b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f89786a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
