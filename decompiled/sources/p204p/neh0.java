package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class neh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f152990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f152991b;

    public neh0(vch0 vch0Var, int i) {
        String str;
        this.f152991b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        if (i == 1) {
            str = x09.f256833e;
        } else {
            if (i != 2) {
                throw null;
            }
            str = x09.f256832d;
        }
        yt91VarM96903c.f276055i.add(new bu91("collaborators_toggle", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f152990a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f152991b.f240134b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(st91Var2.f213866a);
        zt91 zt91Var = this.f152990a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f152990a;
        nu91Var.f248108b = this.f152991b.f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
