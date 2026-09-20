package p204p;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class anp {

    /* JADX INFO: renamed from: a */
    public final hv31 f17479a;

    public anp(hv31 hv31Var) {
        this.f17479a = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public boolean m26530a() {
        fv31 fv31Var = bnp.f28910a;
        hv31 hv31Var = this.f17479a;
        int iMo48717l = hv31Var.mo48717l(fv31Var, 0);
        long jMo48712g = hv31Var.mo48712g(bnp.f28911b, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list = svx.f214527a;
        return iMo48717l < 3 && (((int) TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis - jMo48712g)) >= 2);
    }

    /* JADX INFO: renamed from: b */
    public void m26531b() {
        fv31 fv31Var = bnp.f28910a;
        hv31 hv31Var = this.f17479a;
        int iMo48717l = hv31Var.mo48717l(fv31Var, 0);
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60049b(fv31Var, iMo48717l + 1);
        lv31VarEdit.m60050c(bnp.f28911b, System.currentTimeMillis());
        lv31VarEdit.m60054g();
    }

    public anp(xre xreVar, hv31 hv31Var) {
        this.f17479a = hv31Var;
    }
}
