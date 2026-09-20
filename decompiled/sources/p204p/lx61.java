package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lx61 {

    /* JADX INFO: renamed from: a */
    public final String f137735a;

    /* JADX INFO: renamed from: b */
    public final String f137736b;

    /* JADX INFO: renamed from: c */
    public final List f137737c;

    /* JADX INFO: renamed from: d */
    public final String f137738d;

    /* JADX INFO: renamed from: e */
    public final int f137739e;

    public lx61(int i, String str, String str2, String str3, List list) {
        this.f137735a = str;
        this.f137736b = str2;
        this.f137737c = list;
        this.f137738d = str3;
        this.f137739e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx61)) {
            return false;
        }
        lx61 lx61Var = (lx61) obj;
        return wj50.m88271j(this.f137735a, lx61Var.f137735a) && wj50.m88271j(this.f137736b, lx61Var.f137736b) && wj50.m88271j(this.f137737c, lx61Var.f137737c) && wj50.m88271j(this.f137738d, lx61Var.f137738d) && this.f137739e == lx61Var.f137739e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f137739e) + s571.m77243b(s571.m77244c(s571.m77243b(this.f137735a.hashCode() * 31, 31, this.f137736b), 31, this.f137737c), 31, this.f137738d);
    }
}
