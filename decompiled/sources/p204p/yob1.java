package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yob1 {

    /* JADX INFO: renamed from: a */
    public final int f274618a;

    /* JADX INFO: renamed from: b */
    public final String f274619b;

    /* JADX INFO: renamed from: c */
    public final List f274620c;

    public yob1(String str, int i, List list) {
        this.f274618a = i;
        this.f274619b = str;
        this.f274620c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yob1)) {
            return false;
        }
        yob1 yob1Var = (yob1) obj;
        return this.f274618a == yob1Var.f274618a && wj50.m88271j(this.f274619b, yob1Var.f274619b) && wj50.m88271j(this.f274620c, yob1Var.f274620c);
    }

    public final int hashCode() {
        return this.f274620c.hashCode() + s571.m77243b(edb.m38547C(this.f274618a) * 31, 31, this.f274619b);
    }
}
