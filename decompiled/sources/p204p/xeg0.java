package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class xeg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f260714a;

    /* JADX INFO: renamed from: b */
    public final zt91 f260715b;

    public xeg0(String str, st91 st91Var) {
        this.f260714a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-chat-sticker";
        yt91VarM50626j.f276052f = "1.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276050d = str;
        this.f260715b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f260714a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f260715b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
