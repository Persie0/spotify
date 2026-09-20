package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vjh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241996a;

    /* JADX INFO: renamed from: b */
    public final zt91 f241997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vch0 f241998c;

    public vjh0(vch0 vch0Var, int i) {
        this.f241996a = i;
        switch (i) {
            case 1:
                this.f241998c = vch0Var;
                yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("skip_previous_gesture", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f241997b = yt91VarM96903c.m94607a();
                break;
            default:
                this.f241998c = vch0Var;
                yt91 yt91VarM96903c2 = vch0Var.f240135c.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("skip_next_gesture", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f241997b = yt91VarM96903c2.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f241996a;
        vch0 vch0Var = this.f241998c;
        zt91 zt91Var = this.f241997b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = vch0Var.f240134b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            default:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = vch0Var.f240134b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
        }
    }

    /* JADX INFO: renamed from: e */
    public av91 m85776e(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", string), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), this.f241997b, this.f241998c.f240134b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public av91 m85777h(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("skip_to_previous", 2, kkc0.m56695h0(new pqm0("item_to_be_skipped", string), new pqm0("position_ms", ""), new pqm0("total_content_ms", ""))), this.f241997b, this.f241998c.f240134b, System.currentTimeMillis());
    }
}
