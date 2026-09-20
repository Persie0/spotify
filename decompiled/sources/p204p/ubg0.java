package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ubg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f228748a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vbg0 f228749b;

    public ubg0(vbg0 vbg0Var) {
        this.f228749b = vbg0Var;
        yt91 yt91VarM96903c = vbg0Var.f239496b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("pre_purchase_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f228748a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f228749b.f239495a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f228748a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f228748a;
        nu91Var.f248108b = this.f228749b.f239495a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
