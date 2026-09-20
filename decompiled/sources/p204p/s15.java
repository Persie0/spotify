package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class s15 {

    /* JADX INFO: renamed from: a */
    public final Integer f204596a;

    /* JADX INFO: renamed from: b */
    public final String f204597b;

    /* JADX INFO: renamed from: c */
    public final yxf f204598c;

    /* JADX INFO: renamed from: d */
    public final r15 f204599d;

    public s15(Integer num, String str, yxf yxfVar, r15 r15Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        yxfVar = (i & 4) != 0 ? null : yxfVar;
        r15Var = (i & 8) != 0 ? null : r15Var;
        this.f204596a = num;
        this.f204597b = str;
        this.f204598c = yxfVar;
        this.f204599d = r15Var;
    }

    /* JADX INFO: renamed from: a */
    public final fyf m76912a(fxh0 fxh0Var, if71 if71Var, n6f n6fVar, zt20 zt20Var, xq00 xq00Var, int i) {
        zt20 zt20Var2;
        fyf fyfVar;
        String strM13l;
        if ((i & 1) != 0) {
            fxh0Var = cxh0.f43038a;
        }
        fxh0 fxh0Var2 = fxh0Var;
        if71 if71Var2 = (i & 2) != 0 ? null : if71Var;
        n6f n6fVar2 = (i & 4) != 0 ? null : n6fVar;
        r15 r15Var = this.f204599d;
        if (r15Var != null) {
            zt20Var2 = zt20Var;
            fyfVar = new fyf(new h81(r15Var, zt20Var2, if71Var2, n6fVar2, fxh0Var2, 2), true, -247872458);
        } else {
            zt20Var2 = zt20Var;
            yxf yxfVar = this.f204598c;
            if (yxfVar != null) {
                fyfVar = new fyf(new h81(yxfVar, zt20Var2, if71Var2, n6fVar2, fxh0Var2, 1), true, -1381132514);
            } else {
                String str = this.f204597b;
                fyfVar = str != null ? new fyf(new h81(str, zt20Var2, if71Var2, n6fVar2, fxh0Var2, 3), true, -1465842740) : null;
            }
        }
        if (fyfVar != null) {
            xq00Var.m91771i0(-1122295248);
            xq00Var.m91788r(false);
            return fyfVar;
        }
        xq00Var.m91771i0(-431128901);
        Integer num = this.f204596a;
        if (num == null) {
            xq00Var.m91771i0(-431166474);
            xq00Var.m91788r(false);
            strM13l = null;
        } else {
            strM13l = AbstractC0000a.m13l(xq00Var, -431166473, num, xq00Var, false);
        }
        fyf fyfVar2 = strM13l != null ? new fyf(new h81(strM13l, zt20Var2, if71Var2, n6fVar2, fxh0Var2, 3), true, -1465842740) : null;
        xq00Var.m91788r(false);
        return fyfVar2;
    }

    /* JADX INFO: renamed from: b */
    public final fyf m76913b(fxh0 fxh0Var, if71 if71Var, n6f n6fVar, xq00 xq00Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            fxh0Var = cxh0.f43038a;
        }
        return m76912a(fxh0Var, (i2 & 2) != 0 ? null : if71Var, (i2 & 4) != 0 ? null : n6fVar, null, xq00Var, 0);
    }

    /* JADX INFO: renamed from: c */
    public final String m76914c(xq00 xq00Var) {
        String str;
        j15 j15VarMo36390m;
        r15 r15Var = this.f204599d;
        if (r15Var == null) {
            xq00Var.m91771i0(-249192858);
            xq00Var.m91788r(false);
            str = null;
        } else {
            xq00Var.m91771i0(-249192857);
            xq00Var.m91771i0(-1809153613);
            str = r15Var.f194764a.mo49975d(r15Var.f194765b, xq00Var).f107641b;
            xq00Var.m91788r(false);
            xq00Var.m91788r(false);
        }
        if (str == null) {
            xq00Var.m91771i0(-249103019);
            yxf yxfVar = this.f204598c;
            if (yxfVar == null) {
                xq00Var.m91771i0(-249112041);
                xq00Var.m91788r(false);
                j15VarMo36390m = null;
            } else {
                xq00Var.m91771i0(-1809151190);
                j15VarMo36390m = yxfVar.mo36390m(xq00Var);
                xq00Var.m91788r(false);
            }
            String str2 = j15VarMo36390m != null ? j15VarMo36390m.f107641b : null;
            xq00Var.m91788r(false);
            str = str2;
        } else {
            xq00Var.m91771i0(-1809154464);
            xq00Var.m91788r(false);
        }
        if (str != null) {
            xq00Var.m91771i0(-1809154426);
            xq00Var.m91788r(false);
            return str;
        }
        xq00Var.m91771i0(-1809150241);
        String strM52998r = jcg1.m52998r(this.f204596a, this.f204597b, xq00Var);
        xq00Var.m91788r(false);
        return strM52998r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s15)) {
            return false;
        }
        s15 s15Var = (s15) obj;
        return wj50.m88271j(this.f204596a, s15Var.f204596a) && wj50.m88271j(this.f204597b, s15Var.f204597b) && wj50.m88271j(this.f204598c, s15Var.f204598c) && wj50.m88271j(this.f204599d, s15Var.f204599d);
    }

    public final int hashCode() {
        Integer num = this.f204596a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f204597b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        yxf yxfVar = this.f204598c;
        int iHashCode3 = (iHashCode2 + (yxfVar == null ? 0 : yxfVar.hashCode())) * 31;
        r15 r15Var = this.f204599d;
        return iHashCode3 + (r15Var != null ? r15Var.hashCode() : 0);
    }
}
