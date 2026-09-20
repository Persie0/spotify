package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lj0 {

    /* JADX INFO: renamed from: a */
    public final int f133924a;

    /* JADX INFO: renamed from: b */
    public final String f133925b;

    /* JADX INFO: renamed from: c */
    public final String f133926c;

    /* JADX INFO: renamed from: d */
    public final List f133927d;

    /* JADX INFO: renamed from: e */
    public final tdu f133928e;

    public lj0(int i, String str, String str2, List list, tdu tduVar) {
        this.f133924a = i;
        this.f133925b = str;
        this.f133926c = str2;
        this.f133927d = list;
        this.f133928e = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return this.f133924a == lj0Var.f133924a && wj50.m88271j(this.f133925b, lj0Var.f133925b) && wj50.m88271j(this.f133926c, lj0Var.f133926c) && wj50.m88271j(this.f133927d, lj0Var.f133927d) && this.f133928e.equals(lj0Var.f133928e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(edb.m38547C(this.f133924a) * 31, 31, this.f133925b);
        String str = this.f133926c;
        return this.f133928e.hashCode() + s571.m77244c((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f133927d);
    }
}
