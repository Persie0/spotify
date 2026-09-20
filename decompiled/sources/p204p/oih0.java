package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class oih0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f165820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f165821b;

    public oih0(vch0 vch0Var, int i) {
        String str;
        this.f165821b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        if (i == 1) {
            str = "new_badge_disabled";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "new_badge_enabled";
        }
        yt91VarM96903c.f276055i.add(new bu91("referrals_row", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f165820a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f165821b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f165820a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f165820a;
        nu91Var.f248108b = this.f165821b.f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
