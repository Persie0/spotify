package p204p;

import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class hd60 {

    /* JADX INFO: renamed from: a */
    public final lzd1 f90029a;

    /* JADX INFO: renamed from: b */
    public final Collection f90030b;

    /* JADX INFO: renamed from: c */
    public final boolean f90031c;

    /* JADX INFO: renamed from: d */
    public final boolean f90032d;

    /* JADX INFO: renamed from: e */
    public final boolean f90033e;

    public hd60(lzd1 lzd1Var, Collection collection, boolean z, boolean z2, boolean z3) {
        this.f90029a = lzd1Var;
        this.f90030b = collection;
        this.f90031c = z;
        this.f90032d = z2;
        this.f90033e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd60)) {
            return false;
        }
        hd60 hd60Var = (hd60) obj;
        return wj50.m88271j(this.f90029a, hd60Var.f90029a) && wj50.m88271j(this.f90030b, hd60Var.f90030b) && this.f90031c == hd60Var.f90031c && this.f90032d == hd60Var.f90032d && this.f90033e == hd60Var.f90033e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90033e) + s571.m77245d(s571.m77245d((this.f90030b.hashCode() + (this.f90029a.hashCode() * 31)) * 31, 31, this.f90031c), 31, this.f90032d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f90029a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f90030b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f90031c);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.f90032d);
        sb.append(", preferQualifierOverSupertype=");
        return s571.m77253l(sb, this.f90033e, ')');
    }

    public hd60(lzd1 lzd1Var, Collection collection, int i) {
        this(lzd1Var, collection, lzd1Var.f138351a == klk0.f123919c, (i & 8) == 0, (i & 16) == 0);
    }
}
