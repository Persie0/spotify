package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lm2 {

    /* JADX INFO: renamed from: a */
    public final String f134756a;

    /* JADX INFO: renamed from: b */
    public final String f134757b;

    /* JADX INFO: renamed from: c */
    public final Long f134758c;

    /* JADX INFO: renamed from: d */
    public final r891 f134759d;

    /* JADX INFO: renamed from: e */
    public final List f134760e;

    /* JADX INFO: renamed from: f */
    public final int f134761f;

    public lm2(String str, String str2, Long l, r891 r891Var, List list, int i) {
        this.f134756a = str;
        this.f134757b = str2;
        this.f134758c = l;
        this.f134759d = r891Var;
        this.f134760e = list;
        this.f134761f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm2)) {
            return false;
        }
        lm2 lm2Var = (lm2) obj;
        return this.f134756a.equals(lm2Var.f134756a) && wj50.m88271j(this.f134757b, lm2Var.f134757b) && wj50.m88271j(this.f134758c, lm2Var.f134758c) && this.f134759d == lm2Var.f134759d && wj50.m88271j(this.f134760e, lm2Var.f134760e) && this.f134761f == lm2Var.f134761f;
    }

    public final int hashCode() {
        int iHashCode = this.f134756a.hashCode() * 31;
        String str = this.f134757b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f134758c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        r891 r891Var = this.f134759d;
        int iM77244c = s571.m77244c((iHashCode3 + (r891Var == null ? 0 : r891Var.hashCode())) * 31, 31, this.f134760e);
        int i = this.f134761f;
        return iM77244c + (i != 0 ? edb.m38547C(i) : 0);
    }
}
