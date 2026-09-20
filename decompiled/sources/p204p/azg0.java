package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class azg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21603a;

    /* JADX INFO: renamed from: b */
    public final zt91 f21604b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bzg0 f21605c;

    public azg0(bzg0 bzg0Var, int i) {
        this.f21603a = i;
        switch (i) {
            case 1:
                this.f21605c = bzg0Var;
                yt91 yt91VarM96903c = bzg0Var.f32493b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("content_area", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f21604b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f21605c = bzg0Var;
                yt91 yt91VarM96903c2 = bzg0Var.f32493b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("main_controls", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f21604b = yt91VarM96903c2.m94607a();
                break;
            case 3:
                this.f21605c = bzg0Var;
                yt91 yt91VarM96903c3 = bzg0Var.f32493b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f21604b = yt91VarM96903c3.m94607a();
                break;
            case 4:
                this.f21605c = bzg0Var;
                yt91 yt91VarM96903c4 = bzg0Var.f32493b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("track_information", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                this.f21604b = yt91VarM96903c4.m94607a();
                break;
            default:
                this.f21605c = bzg0Var;
                yt91 yt91VarM96903c5 = bzg0Var.f32493b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("bottom_bar", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                this.f21604b = yt91VarM96903c5.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f21603a;
        bzg0 bzg0Var = this.f21605c;
        zt91 zt91Var = this.f21604b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = bzg0Var.f32492a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = bzg0Var.f32492a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = bzg0Var.f32492a;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = bzg0Var.f32492a;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            default:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = bzg0Var.f32492a;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var10 != null) {
                    arrayList5.addAll(st91Var10.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
        }
    }
}
