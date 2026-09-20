package p204p;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ybl0 {

    /* JADX INFO: renamed from: a */
    public final nbl0 f271209a;

    /* JADX INFO: renamed from: b */
    public final qu01 f271210b;

    /* JADX INFO: renamed from: c */
    public final int f271211c;

    /* JADX INFO: renamed from: d */
    public final String f271212d;

    /* JADX INFO: renamed from: e */
    public final String f271213e;

    /* JADX INFO: renamed from: f */
    public final String f271214f;

    /* JADX INFO: renamed from: g */
    public final boolean f271215g;

    public ybl0(nbl0 nbl0Var, qu01 qu01Var, int i, String str, String str2, String str3, boolean z) {
        this.f271209a = nbl0Var;
        this.f271210b = qu01Var;
        this.f271211c = i;
        this.f271212d = str;
        this.f271213e = str2;
        this.f271214f = str3;
        this.f271215g = z;
    }

    /* JADX INFO: renamed from: a */
    public final zbl0 m93288a() {
        nbl0 mbl0Var;
        Set set = this.f271210b.f192533a.f213203c.f184152b;
        nbl0 nbl0Var = this.f271209a;
        j3r j3rVarMo50186c = set.contains(nbl0Var.m64098h()) ? i3r.f98255a : nbl0Var.mo50186c();
        if (nbl0Var instanceof lbl0) {
            lbl0 lbl0Var = (lbl0) nbl0Var;
            mbl0Var = new lbl0(lbl0Var.f131682a, j3rVarMo50186c, lbl0Var.f131684c, lbl0Var.f131685d);
        } else if (nbl0Var instanceof jbl0) {
            jbl0 jbl0Var = (jbl0) nbl0Var;
            mbl0Var = new jbl0(jbl0Var.f110827a, jbl0Var.f110828b, j3rVarMo50186c, jbl0Var.f110830d);
        } else if (nbl0Var instanceof kbl0) {
            kbl0 kbl0Var = (kbl0) nbl0Var;
            mbl0Var = new kbl0(kbl0Var.f121226a, kbl0Var.f121227b, j3rVarMo50186c, kbl0Var.f121229d);
        } else if (nbl0Var instanceof ibl0) {
            ibl0 ibl0Var = (ibl0) nbl0Var;
            mbl0Var = new ibl0(ibl0Var.f100604a, ibl0Var.f100605b, j3rVarMo50186c, ibl0Var.f100607d);
        } else {
            if (!(nbl0Var instanceof mbl0)) {
                throw new NoWhenBranchMatchedException();
            }
            mbl0 mbl0Var2 = (mbl0) nbl0Var;
            mbl0Var = new mbl0(mbl0Var2.f141943a, mbl0Var2.f141944b, j3rVarMo50186c, mbl0Var2.f141946d);
        }
        return new zbl0(mbl0Var, this.f271215g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybl0)) {
            return false;
        }
        ybl0 ybl0Var = (ybl0) obj;
        return wj50.m88271j(this.f271209a, ybl0Var.f271209a) && wj50.m88271j(this.f271210b, ybl0Var.f271210b) && this.f271211c == ybl0Var.f271211c && wj50.m88271j(this.f271212d, ybl0Var.f271212d) && wj50.m88271j(this.f271213e, ybl0Var.f271213e) && wj50.m88271j(this.f271214f, ybl0Var.f271214f) && this.f271215g == ybl0Var.f271215g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271215g) + s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f271211c, (this.f271210b.hashCode() + (this.f271209a.hashCode() * 31)) * 31, 31), 31, this.f271212d), 31, this.f271213e), 31, this.f271214f);
    }
}
