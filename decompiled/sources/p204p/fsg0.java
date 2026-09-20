package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fsg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f72850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ psg0 f72851b;

    public fsg0(psg0 psg0Var, String str, String str2) {
        this.f72851b = psg0Var;
        yt91 yt91VarM96903c = psg0Var.f180856b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("ask_to_join_popup", str, null, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f72850a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f72851b.f180855a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f72850a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f72850a;
        nu91Var.f248108b = this.f72851b.f180855a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
