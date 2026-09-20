package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rqg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f201829a;

    /* JADX INFO: renamed from: b */
    public final zt91 f201830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sqg0 f201831c;

    public rqg0(sqg0 sqg0Var, int i) {
        this.f201829a = i;
        switch (i) {
            case 1:
                this.f201831c = sqg0Var;
                yt91 yt91VarM96903c = sqg0Var.f213103b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("wrong_pin_error_label", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                this.f201830b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f201831c = sqg0Var;
                yt91 yt91VarM96903c2 = sqg0Var.f213103b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("generic_error_label", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                this.f201830b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f201829a;
        sqg0 sqg0Var = this.f201831c;
        zt91 zt91Var = this.f201830b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = sqg0Var.f213102a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = sqg0Var.f213102a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f201829a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f201830b;
                sqg0 sqg0Var = this.f201831c;
                nu91Var.f248108b = sqg0Var.f213102a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = sqg0Var.f213104c;
                return (ou91) nu91Var.m87248a();
            default:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f201830b;
                sqg0 sqg0Var2 = this.f201831c;
                nu91Var2.f248108b = sqg0Var2.f213102a;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = sqg0Var2.f213104c;
                return (ou91) nu91Var2.m87248a();
        }
    }
}
