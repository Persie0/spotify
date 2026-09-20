package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class n5i0 {

    /* JADX INFO: renamed from: a */
    public final Object f150563a;

    /* JADX INFO: renamed from: b */
    public final int f150564b;

    /* JADX INFO: renamed from: c */
    public final String f150565c;

    /* JADX INFO: renamed from: d */
    public final Integer f150566d;

    /* JADX INFO: renamed from: e */
    public final Integer f150567e;

    public /* synthetic */ n5i0(List list) {
        this(list, 1, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5i0)) {
            return false;
        }
        n5i0 n5i0Var = (n5i0) obj;
        return wj50.m88271j(this.f150563a, n5i0Var.f150563a) && this.f150564b == n5i0Var.f150564b && wj50.m88271j(this.f150565c, n5i0Var.f150565c) && wj50.m88271j(this.f150566d, n5i0Var.f150566d) && wj50.m88271j(this.f150567e, n5i0Var.f150567e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f150564b, this.f150563a.hashCode() * 31, 31);
        String str = this.f150565c;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f150566d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f150567e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public n5i0(List list, int i, String str, Integer num, Integer num2) {
        this.f150563a = list;
        this.f150564b = i;
        this.f150565c = str;
        this.f150566d = num;
        this.f150567e = num2;
    }
}
