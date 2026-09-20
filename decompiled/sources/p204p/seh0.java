package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class seh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f208300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ueh0 f208301b;

    public seh0(ueh0 ueh0Var) {
        this.f208301b = ueh0Var;
        yt91 yt91VarM96903c = ueh0Var.f229541b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("search_bar", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f208300a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f208301b.f229540a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f208300a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
