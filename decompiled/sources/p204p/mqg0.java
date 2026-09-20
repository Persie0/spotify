package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class mqg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f146282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f146283b;

    public mqg0(hog0 hog0Var) {
        this.f146283b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("error_view", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f146282a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f146283b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f146282a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f146282a;
        nu91Var.f248108b = this.f146283b.f93537b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
