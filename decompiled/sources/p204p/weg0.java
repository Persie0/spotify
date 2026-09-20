package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class weg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f250529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xeg0 f250530b;

    public weg0(xeg0 xeg0Var) {
        this.f250530b = xeg0Var;
        yt91 yt91VarM96903c = xeg0Var.f260715b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("play_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f250529a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f250530b.f260714a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f250529a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
