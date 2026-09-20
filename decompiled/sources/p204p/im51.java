package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class im51 implements km51 {

    /* JADX INFO: renamed from: a */
    public final int f103595a;

    /* JADX INFO: renamed from: b */
    public final qla1 f103596b;

    /* JADX INFO: renamed from: c */
    public final String f103597c;

    /* JADX INFO: renamed from: d */
    public final String f103598d;

    /* JADX INFO: renamed from: e */
    public final g7y0 f103599e;

    /* JADX INFO: renamed from: f */
    public final km51 f103600f;

    /* JADX INFO: renamed from: g */
    public final boolean f103601g;

    /* JADX INFO: renamed from: h */
    public final List f103602h;

    /* JADX INFO: renamed from: i */
    public final Map f103603i;

    public im51(int i, qla1 qla1Var, String str, String str2, g7y0 g7y0Var, im51 im51Var, boolean z, List list, Map map) {
        this.f103595a = i;
        this.f103596b = qla1Var;
        this.f103597c = str;
        this.f103598d = str2;
        this.f103599e = g7y0Var;
        this.f103600f = im51Var;
        this.f103601g = z;
        this.f103602h = list;
        this.f103603i = map;
    }

    @Override // p204p.km51
    /* JADX INFO: renamed from: a */
    public final String mo51052a() {
        return this.f103598d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im51)) {
            return false;
        }
        im51 im51Var = (im51) obj;
        return this.f103595a == im51Var.f103595a && wj50.m88271j(this.f103596b, im51Var.f103596b) && wj50.m88271j(this.f103597c, im51Var.f103597c) && wj50.m88271j(this.f103598d, im51Var.f103598d) && wj50.m88271j(this.f103599e, im51Var.f103599e) && wj50.m88271j(this.f103600f, im51Var.f103600f) && this.f103601g == im51Var.f103601g && wj50.m88271j(this.f103602h, im51Var.f103602h) && wj50.m88271j(this.f103603i, im51Var.f103603i);
    }

    @Override // p204p.km51
    public final String getUri() {
        return this.f103597c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f103595a) * 31;
        qla1 qla1Var = this.f103596b;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode + (qla1Var == null ? 0 : qla1Var.hashCode())) * 31, 31, this.f103597c), 31, this.f103598d);
        g7y0 g7y0Var = this.f103599e;
        int iHashCode2 = (iM77243b + (g7y0Var == null ? 0 : g7y0Var.hashCode())) * 31;
        km51 km51Var = this.f103600f;
        return this.f103603i.hashCode() + s571.m77244c(s571.m77245d((iHashCode2 + (km51Var != null ? km51Var.hashCode() : 0)) * 31, 31, this.f103601g), 31, this.f103602h);
    }
}
