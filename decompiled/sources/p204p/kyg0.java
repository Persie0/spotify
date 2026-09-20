package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class kyg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f127851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f127852b;

    public kyg0(hog0 hog0Var, String str) {
        this.f127852b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("captions_button", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f127851a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f127852b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f127851a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
