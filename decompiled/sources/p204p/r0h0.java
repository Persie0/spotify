package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class r0h0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f194490a;

    /* JADX INFO: renamed from: b */
    public final zt91 f194491b;

    public r0h0(int i, st91 st91Var) {
        String str;
        this.f194490a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-offline-dead-ends-error-page";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "airplane_mode";
        } else if (i == 2) {
            str = "forced_offline";
        } else if (i == 3) {
            str = "no_connectivity";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "unknown";
        }
        yt91VarM50626j.f276051e = str;
        this.f194491b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f194490a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f194491b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f194491b;
        nu91Var.f248108b = this.f194490a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
