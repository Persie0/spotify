package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rfg0 implements xt91, qv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f198646a;

    /* JADX INFO: renamed from: b */
    public final zt91 f198647b;

    public rfg0(Integer num, String str, st91 st91Var) {
        this.f198646a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-comments-interactivity-card";
        yt91VarM50626j.f276052f = "10.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str;
        this.f198647b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f198646a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f198647b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f198647b;
        nu91Var.f248108b = this.f198646a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return new kt91((ou91) nu91Var.m87248a());
    }
}
