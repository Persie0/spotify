package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class y9g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f270588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zm8 f270589b;

    public y9g0(zm8 zm8Var, Integer num, String str) {
        this.f270589b = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("artist", null, num, str, null));
        yt91VarM96903c.f276056j = false;
        this.f270588a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f270589b.f284179b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f270588a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
