package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class yeg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f271993a;

    public yeg0(bbg0 bbg0Var) {
        yt91 yt91VarM96903c = bbg0Var.f25561b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("lyrics_suggestions_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f271993a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f271993a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
