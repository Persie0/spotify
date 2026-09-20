package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lkw0 {

    /* JADX INFO: renamed from: a */
    public final Map f134468a;

    /* JADX INFO: renamed from: b */
    public final int f134469b;

    /* JADX INFO: renamed from: c */
    public final boolean f134470c;

    /* JADX INFO: renamed from: d */
    public final boolean f134471d;

    public lkw0(Map map, int i, boolean z, boolean z2) {
        this.f134468a = map;
        this.f134469b = i;
        this.f134470c = z;
        this.f134471d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkw0)) {
            return false;
        }
        lkw0 lkw0Var = (lkw0) obj;
        return wj50.m88271j(this.f134468a, lkw0Var.f134468a) && this.f134469b == lkw0Var.f134469b && this.f134470c == lkw0Var.f134470c && this.f134471d == lkw0Var.f134471d;
    }

    public final int hashCode() {
        Map map = this.f134468a;
        return Boolean.hashCode(this.f134471d) + s571.m77245d(mt60.m62800g(this.f134469b, (map == null ? 0 : map.hashCode()) * 31, 31), 31, this.f134470c);
    }
}
