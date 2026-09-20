package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class mdh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f142419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ndh0 f142420b;

    public mdh0(ndh0 ndh0Var) {
        this.f142420b = ndh0Var;
        yt91 yt91VarM96903c = ndh0Var.f152779b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("settings_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f142419a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f142419a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
