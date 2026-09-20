package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class cch0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f36407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rbh0 f36408b;

    public cch0(rbh0 rbh0Var, Integer num, String str, String str2) {
        this.f36408b = rbh0Var;
        yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("result_item", null, num, str2, str));
        yt91VarM96903c.f276056j = true;
        this.f36407a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m32248a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f36407a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f36407a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f36407a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f36408b.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m32249h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string)), this.f36407a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final av91 m32250i() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f36407a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public final av91 m32251j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string)), this.f36407a, st91.f213865b, System.currentTimeMillis());
    }
}
