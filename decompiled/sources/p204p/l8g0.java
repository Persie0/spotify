package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class l8g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f130860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o8g0 f130861b;

    public l8g0(o8g0 o8g0Var) {
        this.f130861b = o8g0Var;
        yt91 yt91VarM96903c = o8g0Var.f162809b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_different_account_row", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f130860a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f130861b.f162808a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f130860a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final av91 m58472e() {
        return new av91("", "", new dv91("hit", 1), new bv91("logout", 1, nau.f152117a), this.f130860a, this.f130861b.f162808a, System.currentTimeMillis());
    }
}
