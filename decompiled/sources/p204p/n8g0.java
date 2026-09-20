package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class n8g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f151533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o8g0 f151534b;

    public n8g0(o8g0 o8g0Var) {
        this.f151534b = o8g0Var;
        yt91 yt91VarM96903c = o8g0Var.f162809b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("sign_up_under_age_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f151533a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f151534b.f162808a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f151533a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
