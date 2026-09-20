package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class gzg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85940a;

    /* JADX INFO: renamed from: b */
    public final zt91 f85941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hzg0 f85942c;

    public gzg0(hzg0 hzg0Var, int i) {
        this.f85940a = i;
        switch (i) {
            case 1:
                this.f85942c = hzg0Var;
                yt91 yt91VarM96903c = hzg0Var.f96920b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("content_area", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f85941b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f85942c = hzg0Var;
                yt91 yt91VarM96903c2 = hzg0Var.f96920b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("main_controls", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f85941b = yt91VarM96903c2.m94607a();
                break;
            case 3:
                this.f85942c = hzg0Var;
                yt91 yt91VarM96903c3 = hzg0Var.f96920b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f85941b = yt91VarM96903c3.m94607a();
                break;
            case 4:
                this.f85942c = hzg0Var;
                yt91 yt91VarM96903c4 = hzg0Var.f96920b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("track_information", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                this.f85941b = yt91VarM96903c4.m94607a();
                break;
            default:
                this.f85942c = hzg0Var;
                yt91 yt91VarM96903c5 = hzg0Var.f96920b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("bottom_bar", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                this.f85941b = yt91VarM96903c5.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f85940a;
        hzg0 hzg0Var = this.f85942c;
        zt91 zt91Var = this.f85941b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = hzg0Var.f96919a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = hzg0Var.f96919a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = hzg0Var.f96919a;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = hzg0Var.f96919a;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            default:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = hzg0Var.f96919a;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var10 != null) {
                    arrayList5.addAll(st91Var10.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
        }
    }
}
