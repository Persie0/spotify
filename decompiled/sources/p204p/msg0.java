package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class msg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146770a;

    /* JADX INFO: renamed from: b */
    public final zt91 f146771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hsg0 f146772c;

    public msg0(hsg0 hsg0Var, int i) {
        this.f146770a = i;
        switch (i) {
            case 1:
                this.f146772c = hsg0Var;
                yt91 yt91VarM96903c = hsg0Var.f94693b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("system_dismiss", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f146771b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f146772c = hsg0Var;
                yt91 yt91VarM96903c2 = hsg0Var.f94693b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f146771b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f146770a;
        hsg0 hsg0Var = this.f146772c;
        zt91 zt91Var = this.f146771b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = hsg0Var.f94694c.f180855a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = hsg0Var.f94694c.f180855a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final av91 m62742e() {
        switch (this.f146770a) {
            case 0:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f146771b, this.f146772c.f94694c.f180855a, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f146771b, this.f146772c.f94694c.f180855a, System.currentTimeMillis());
        }
    }
}
