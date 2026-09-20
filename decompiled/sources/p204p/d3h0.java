package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class d3h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f44884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2h0 f44885b;

    public d3h0(r2h0 r2h0Var) {
        this.f44885b = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("video_button", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f44884a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f44885b.f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f44884a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f44884a;
        nu91Var.f248108b = this.f44885b.f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m34834h(int i, int i2) {
        String str;
        String str2;
        dv91 dv91Var = new dv91("hit", 1);
        if (i == 1) {
            str = "off";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "on";
        }
        pqm0 pqm0Var = new pqm0("state_before_toggle", str);
        if (i2 == 1) {
            str2 = "off";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = "on";
        }
        return new av91("", "", dv91Var, new bv91("toggle_state", 1, kkc0.m56695h0(pqm0Var, new pqm0("state_after_toggle", str2))), this.f44884a, this.f44885b.f195144b, System.currentTimeMillis());
    }
}
