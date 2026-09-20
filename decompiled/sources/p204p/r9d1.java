package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class r9d1 {

    /* JADX INFO: renamed from: a */
    public final String f197033a;

    /* JADX INFO: renamed from: b */
    public final String f197034b;

    /* JADX INFO: renamed from: c */
    public final List f197035c;

    /* JADX INFO: renamed from: d */
    public final rzd1 f197036d;

    public r9d1(String str, String str2, List list, rzd1 rzd1Var) {
        this.f197033a = str;
        this.f197034b = str2;
        this.f197035c = list;
        this.f197036d = rzd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9d1)) {
            return false;
        }
        r9d1 r9d1Var = (r9d1) obj;
        return wj50.m88271j(this.f197033a, r9d1Var.f197033a) && wj50.m88271j(this.f197034b, r9d1Var.f197034b) && wj50.m88271j(this.f197035c, r9d1Var.f197035c) && this.f197036d.equals(r9d1Var.f197036d);
    }

    public final int hashCode() {
        return this.f197036d.hashCode() + s571.m77244c(s571.m77243b(this.f197033a.hashCode() * 31, 31, this.f197034b), 31, this.f197035c);
    }
}
