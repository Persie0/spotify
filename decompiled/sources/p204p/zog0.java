package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class zog0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f284785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hog0 f284786b;

    public zog0(hog0 hog0Var, int i) {
        String str;
        this.f284786b = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        if (i == 1) {
            str = "already_played";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "available";
        }
        yt91VarM96903c.f276055i.add(new bu91("entry_point_banner", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f284785a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f284786b.f93537b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f284785a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f284785a;
        nu91Var.f248108b = this.f284786b.f93537b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
