package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class hte extends mvf1 {

    /* JADX INFO: renamed from: X */
    public final boolean f94991X;

    /* JADX INFO: renamed from: Y */
    public final List f94992Y;

    /* JADX INFO: renamed from: f */
    public final int f94993f;

    /* JADX INFO: renamed from: g */
    public final int f94994g;

    /* JADX INFO: renamed from: h */
    public final String f94995h;

    /* JADX INFO: renamed from: i */
    public final boolean f94996i;

    /* JADX INFO: renamed from: t */
    public final boolean f94997t;

    public hte(int i, int i2, String str, boolean z, boolean z2, boolean z3, List list) {
        this.f94993f = i;
        this.f94994g = i2;
        this.f94995h = str;
        this.f94996i = z;
        this.f94997t = z2;
        this.f94991X = z3;
        this.f94992Y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hte)) {
            return false;
        }
        hte hteVar = (hte) obj;
        return this.f94993f == hteVar.f94993f && this.f94994g == hteVar.f94994g && wj50.m88271j(this.f94995h, hteVar.f94995h) && this.f94996i == hteVar.f94996i && this.f94997t == hteVar.f94997t && this.f94991X == hteVar.f94991X && wj50.m88271j(this.f94992Y, hteVar.f94992Y);
    }

    public final int hashCode() {
        return this.f94992Y.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(mt60.m62800g(this.f94994g, Integer.hashCode(this.f94993f) * 31, 31), 31, this.f94995h), 31, this.f94996i), 31, this.f94997t), 31, this.f94991X);
    }
}
