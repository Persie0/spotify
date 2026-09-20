package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sqg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f213102a;

    /* JADX INFO: renamed from: b */
    public final zt91 f213103b;

    /* JADX INFO: renamed from: c */
    public final List f213104c;

    public sqg0(st91 st91Var) {
        this.f213102a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-pin-gate";
        yt91VarM50626j.f276052f = "2.2.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f213103b = yt91VarM50626j.m94607a();
        this.f213104c = Collections.singletonList("pin-gate");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f213102a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f213103b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
