package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class fjh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f70295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gjh0 f70296b;

    public fjh0(gjh0 gjh0Var, String str, String str2, String str3) {
        this.f70296b = gjh0Var;
        yt91 yt91VarM96903c = gjh0Var.f80483a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("watch_feed_component", str, null, str3, str2));
        yt91VarM96903c.f276056j = true;
        this.f70295a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m41842a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f70295a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f70295a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f70296b.f80484b.f92053b.f36129c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m41843h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("follow", 1, Collections.singletonMap("item_to_be_followed", string)), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final av91 m41844i(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string)), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public final av91 m41845j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string)), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public final av91 m41846k(String str, Integer num, Integer num2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
        String strValueOf = String.valueOf(0);
        if (strValueOf == null) {
            strValueOf = "";
        }
        pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(0);
        return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public final av91 m41847l() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public final av91 m41848m(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", string)), this.f70295a, st91.f213865b, System.currentTimeMillis());
    }
}
