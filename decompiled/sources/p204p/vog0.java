package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vog0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243478a;

    /* JADX INFO: renamed from: b */
    public final zt91 f243479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hog0 f243480c;

    public vog0(hog0 hog0Var, int i) {
        this.f243478a = i;
        switch (i) {
            case 1:
                this.f243480c = hog0Var;
                yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("liked_songs", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f243479b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f243480c = hog0Var;
                yt91 yt91VarM96903c2 = hog0Var.f93538c.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("playlist", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f243479b = yt91VarM96903c2.m94607a();
                break;
            default:
                this.f243480c = hog0Var;
                yt91 yt91VarM96903c3 = hog0Var.f93538c.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("album", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f243479b = yt91VarM96903c3.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f243478a;
        hog0 hog0Var = this.f243480c;
        zt91 zt91Var = this.f243479b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = hog0Var.f93537b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = hog0Var.f93537b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            default:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = hog0Var.f93537b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
        }
    }

    /* JADX INFO: renamed from: e */
    public s8g0 m86095e(String str) {
        return new s8g0(this, str);
    }

    /* JADX INFO: renamed from: h */
    public s8g0 m86096h(String str) {
        return new s8g0(this, str, (byte) 0);
    }

    /* JADX INFO: renamed from: i */
    public s8g0 m86097i(String str) {
        return new s8g0(this, str, (char) 0);
    }

    /* JADX INFO: renamed from: j */
    public cag0 m86098j(String str) {
        return new cag0(this, str);
    }

    /* JADX INFO: renamed from: k */
    public wog0 m86099k(String str) {
        return new wog0(this, str);
    }

    /* JADX INFO: renamed from: l */
    public xog0 m86100l(String str) {
        return new xog0(this, str);
    }
}
