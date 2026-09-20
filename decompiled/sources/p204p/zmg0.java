package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class zmg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f284274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zm8 f284275b;

    public zmg0(zm8 zm8Var) {
        this.f284275b = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("make_private_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f284274a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f284275b.f284179b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f284274a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
