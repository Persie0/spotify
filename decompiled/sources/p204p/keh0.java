package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class keh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f121892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ leh0 f121893b;

    public keh0(leh0 leh0Var) {
        this.f121893b = leh0Var;
        yt91 yt91VarM96903c = leh0Var.f132552b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_cards_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f121892a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f121893b.f132551a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f121892a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final jeh0 m56218e(Integer num, String str) {
        return new jeh0(this, str, num);
    }
}
