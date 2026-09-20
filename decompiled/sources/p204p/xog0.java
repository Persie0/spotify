package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class xog0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f264280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vog0 f264281b;

    public xog0(vog0 vog0Var, String str) {
        this.f264281b = vog0Var;
        yt91 yt91VarM96903c = vog0Var.f243479b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_toggle", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f264280a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f264281b.f243480c.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f264280a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f264280a;
        nu91Var.f248108b = this.f264281b.f243480c.f93537b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m91545h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f264280a, this.f264281b.f243480c.f93537b, System.currentTimeMillis());
    }
}
