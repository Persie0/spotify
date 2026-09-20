package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class be60 {

    /* JADX INFO: renamed from: a */
    public final int f26285a;

    /* JADX INFO: renamed from: b */
    public final int f26286b;

    /* JADX INFO: renamed from: c */
    public final boolean f26287c;

    /* JADX INFO: renamed from: d */
    public final boolean f26288d;

    /* JADX INFO: renamed from: e */
    public final Set f26289e;

    /* JADX INFO: renamed from: f */
    public final jd21 f26290f;

    public be60(int i, int i2, boolean z, boolean z2, Set set, jd21 jd21Var) {
        this.f26285a = i;
        this.f26286b = i2;
        this.f26287c = z;
        this.f26288d = z2;
        this.f26289e = set;
        this.f26290f = jd21Var;
    }

    /* JADX INFO: renamed from: a */
    public static be60 m28907a(be60 be60Var, int i, boolean z, Set set, jd21 jd21Var, int i2) {
        int i3 = be60Var.f26285a;
        if ((i2 & 2) != 0) {
            i = be60Var.f26286b;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = be60Var.f26287c;
        }
        boolean z2 = z;
        boolean z3 = be60Var.f26288d;
        if ((i2 & 16) != 0) {
            set = be60Var.f26289e;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            jd21Var = be60Var.f26290f;
        }
        be60Var.getClass();
        return new be60(i3, i4, z2, z3, set2, jd21Var);
    }

    /* JADX INFO: renamed from: b */
    public final be60 m28908b(int i) {
        return m28907a(this, i, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof be60)) {
            return false;
        }
        be60 be60Var = (be60) obj;
        return wj50.m88271j(be60Var.f26290f, this.f26290f) && be60Var.f26285a == this.f26285a && be60Var.f26286b == this.f26286b && be60Var.f26287c == this.f26287c && be60Var.f26288d == this.f26288d;
    }

    public final int hashCode() {
        jd21 jd21Var = this.f26290f;
        int iHashCode = jd21Var != null ? jd21Var.hashCode() : 0;
        int iM38547C = edb.m38547C(this.f26285a) + (iHashCode * 31) + iHashCode;
        int iM38547C2 = edb.m38547C(this.f26286b) + (iM38547C * 31) + iM38547C;
        int i = (iM38547C2 * 31) + (this.f26287c ? 1 : 0) + iM38547C2;
        return (i * 31) + (this.f26288d ? 1 : 0) + i;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i = this.f26285a;
        if (i != 1) {
            str = i != 2 ? "null" : "COMMON";
        } else {
            str = "SUPERTYPE";
        }
        sb.append(str);
        sb.append(", flexibility=");
        int i2 = this.f26286b;
        if (i2 == 1) {
            str2 = "INFLEXIBLE";
        } else if (i2 != 2) {
            str2 = i2 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND";
        } else {
            str2 = "FLEXIBLE_UPPER_BOUND";
        }
        sb.append(str2);
        sb.append(", isRaw=");
        sb.append(this.f26287c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.f26288d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.f26289e);
        sb.append(", defaultType=");
        sb.append(this.f26290f);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ be60(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }
}
