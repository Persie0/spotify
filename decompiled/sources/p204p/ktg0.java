package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ktg0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f126290a;

    /* JADX INFO: renamed from: b */
    public final zt91 f126291b;

    public ktg0(int i, Integer num, String str, st91 st91Var) {
        String str2;
        this.f126290a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-link-card";
        yt91VarM50626j.f276052f = "6.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str2 = "card_with_animations";
        } else if (i == 2) {
            str2 = "card_with_image";
        } else if (i == 3) {
            str2 = "card_with_vertical_video";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "play_link_card";
        }
        yt91VarM50626j.f276048b = str2;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str;
        this.f126291b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m57316a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f126291b, this.f126290a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f126290a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f126291b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f126291b;
        nu91Var.f248108b = this.f126290a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: g */
    public final av91 m57317g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f126291b, this.f126290a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public final s8g0 m57318h() {
        return new s8g0(this);
    }
}
