package p204p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l1p0 {

    /* JADX INFO: renamed from: a */
    public final String f128765a;

    /* JADX INFO: renamed from: b */
    public final boolean f128766b;

    /* JADX INFO: renamed from: c */
    public final boolean f128767c;

    /* JADX INFO: renamed from: d */
    public final Map f128768d;

    public l1p0(String str, boolean z, boolean z2, Map map) {
        this.f128765a = str;
        this.f128766b = z;
        this.f128767c = z2;
        this.f128768d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1p0)) {
            return false;
        }
        l1p0 l1p0Var = (l1p0) obj;
        return wj50.m88271j(this.f128765a, l1p0Var.f128765a) && this.f128766b == l1p0Var.f128766b && this.f128767c == l1p0Var.f128767c && wj50.m88271j(this.f128768d, l1p0Var.f128768d);
    }

    public final int hashCode() {
        return this.f128768d.hashCode() + s571.m77245d(s571.m77245d(this.f128765a.hashCode() * 31, 31, this.f128766b), 31, this.f128767c);
    }

    public /* synthetic */ l1p0(String str, int i, Map map) {
        this(str, (i & 2) != 0, false, (i & 8) != 0 ? new HashMap() : map);
    }
}
