package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class k7h0 implements xt91, qv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f120106a;

    /* JADX INFO: renamed from: b */
    public final zt91 f120107b;

    public k7h0(int i, Integer num, String str, st91 st91Var) {
        String str2;
        this.f120106a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-promotion-card";
        yt91VarM50626j.f276052f = "3.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        switch (i) {
            case 1:
                str2 = "playable_cache";
                break;
            case 2:
                str2 = "promo_v1";
                break;
            case 3:
                str2 = "promo_v3";
                break;
            case 4:
                str2 = "showcase";
                break;
            case 5:
                str2 = "showcase_visuals";
                break;
            case 6:
                str2 = "spotlight";
                break;
            default:
                throw null;
        }
        yt91VarM50626j.f276048b = str2;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str;
        this.f120107b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m55660a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f120107b, this.f120106a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f120106a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f120107b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f120107b;
        nu91Var.f248108b = this.f120106a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return new kt91((ou91) nu91Var.m87248a());
    }

    /* JADX INFO: renamed from: g */
    public final av91 m55661g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f120107b, this.f120106a, System.currentTimeMillis());
    }
}
