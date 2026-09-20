package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vqg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f243948a;

    /* JADX INFO: renamed from: b */
    public final List f243949b;

    public vqg0(int i) {
        String str;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-genpods-connector-apps-page";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "availability";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "selection";
        }
        yt91VarM50626j.f276051e = str;
        this.f243948a = yt91VarM50626j.m94607a();
        this.f243949b = Collections.singletonList("bluejay/connector-apps");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f243948a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
