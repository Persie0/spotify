package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fi40 {

    /* JADX INFO: renamed from: a */
    public final Map f69771a;

    /* JADX INFO: renamed from: b */
    public final List f69772b;

    /* JADX INFO: renamed from: c */
    public final boolean f69773c;

    /* JADX INFO: renamed from: d */
    public final String f69774d;

    /* JADX INFO: renamed from: e */
    public final boolean f69775e;

    public fi40(Map map, List list, boolean z, String str, boolean z2) {
        this.f69771a = map;
        this.f69772b = list;
        this.f69773c = z;
        this.f69774d = str;
        this.f69775e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static fi40 m41691a(fi40 fi40Var, Map map, List list, boolean z, String str, boolean z2, int i) {
        if ((i & 1) != 0) {
            map = fi40Var.f69771a;
        }
        Map map2 = map;
        if ((i & 2) != 0) {
            list = fi40Var.f69772b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = fi40Var.f69773c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = fi40Var.f69774d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z2 = fi40Var.f69775e;
        }
        fi40Var.getClass();
        return new fi40(map2, list2, z3, str2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi40)) {
            return false;
        }
        fi40 fi40Var = (fi40) obj;
        return wj50.m88271j(this.f69771a, fi40Var.f69771a) && wj50.m88271j(this.f69772b, fi40Var.f69772b) && this.f69773c == fi40Var.f69773c && wj50.m88271j(this.f69774d, fi40Var.f69774d) && this.f69775e == fi40Var.f69775e;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77244c(this.f69771a.hashCode() * 31, 31, this.f69772b), 31, this.f69773c);
        String str = this.f69774d;
        return Boolean.hashCode(this.f69775e) + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }
}
