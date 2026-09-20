package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class lxg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f137814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bbg0 f137815b;

    public lxg0(bbg0 bbg0Var) {
        this.f137815b = bbg0Var;
        yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("empty_view", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f137814a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f137814a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f137814a;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
