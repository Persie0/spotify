package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rs11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f202159a;

    /* JADX INFO: renamed from: b */
    public final String f202160b;

    /* JADX INFO: renamed from: c */
    public final String f202161c;

    /* JADX INFO: renamed from: d */
    public final List f202162d;

    /* JADX INFO: renamed from: e */
    public final js11 f202163e;

    /* JADX INFO: renamed from: f */
    public final js11 f202164f;

    public rs11(String str, String str2, String str3, ae50 ae50Var, js11 js11Var, js11 js11Var2) {
        this.f202159a = str;
        this.f202160b = str2;
        this.f202161c = str3;
        this.f202162d = ae50Var;
        this.f202163e = js11Var;
        this.f202164f = js11Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs11)) {
            return false;
        }
        rs11 rs11Var = (rs11) obj;
        return wj50.m88271j(this.f202159a, rs11Var.f202159a) && wj50.m88271j(this.f202160b, rs11Var.f202160b) && wj50.m88271j(this.f202161c, rs11Var.f202161c) && wj50.m88271j(this.f202162d, rs11Var.f202162d) && wj50.m88271j(this.f202163e, rs11Var.f202163e) && wj50.m88271j(this.f202164f, rs11Var.f202164f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f202159a.hashCode() * 31, 31, this.f202160b);
        String str = this.f202161c;
        int iM77244c = s571.m77244c((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f202162d);
        js11 js11Var = this.f202163e;
        int iHashCode = (iM77244c + (js11Var == null ? 0 : js11Var.hashCode())) * 31;
        js11 js11Var2 = this.f202164f;
        return iHashCode + (js11Var2 != null ? js11Var2.hashCode() : 0);
    }
}
