package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class g2h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f75933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f75934b;

    public g2h0(hog0 hog0Var) {
        this.f75934b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("change_image_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f75933a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f75934b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f75933a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
