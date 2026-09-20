package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lxt0 extends nxt0 {

    /* JADX INFO: renamed from: a */
    public final ryt0 f137881a;

    /* JADX INFO: renamed from: b */
    public final String f137882b;

    /* JADX INFO: renamed from: c */
    public final List f137883c;

    /* JADX INFO: renamed from: d */
    public final List f137884d;

    public lxt0(ryt0 ryt0Var, String str, List list, List list2) {
        this.f137881a = ryt0Var;
        this.f137882b = str;
        this.f137883c = list;
        this.f137884d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxt0)) {
            return false;
        }
        lxt0 lxt0Var = (lxt0) obj;
        return wj50.m88271j(this.f137881a, lxt0Var.f137881a) && wj50.m88271j(this.f137882b, lxt0Var.f137882b) && wj50.m88271j(this.f137883c, lxt0Var.f137883c) && wj50.m88271j(this.f137884d, lxt0Var.f137884d);
    }

    public final int hashCode() {
        return this.f137884d.hashCode() + s571.m77244c(s571.m77243b(this.f137881a.hashCode() * 31, 31, this.f137882b), 31, this.f137883c);
    }
}
