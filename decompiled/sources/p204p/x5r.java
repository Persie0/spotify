package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class x5r {

    /* JADX INFO: renamed from: a */
    public final String f258497a;

    /* JADX INFO: renamed from: b */
    public final String f258498b;

    /* JADX INFO: renamed from: c */
    public final String f258499c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f258500d;

    /* JADX INFO: renamed from: e */
    public final int f258501e;

    /* JADX INFO: renamed from: f */
    public final boolean f258502f;

    public x5r(String str, String str2, String str3, ArrayList arrayList, int i, boolean z) {
        this.f258497a = str;
        this.f258498b = str2;
        this.f258499c = str3;
        this.f258500d = arrayList;
        this.f258501e = i;
        this.f258502f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5r)) {
            return false;
        }
        x5r x5rVar = (x5r) obj;
        return wj50.m88271j(this.f258497a, x5rVar.f258497a) && wj50.m88271j(this.f258498b, x5rVar.f258498b) && wj50.m88271j(this.f258499c, x5rVar.f258499c) && this.f258500d.equals(x5rVar.f258500d) && this.f258501e == x5rVar.f258501e && this.f258502f == x5rVar.f258502f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258502f) + mt60.m62800g(this.f258501e, lq51.m59700f(this.f258500d, s571.m77243b(s571.m77243b(this.f258497a.hashCode() * 31, 31, this.f258498b), 31, this.f258499c), 31), 31);
    }
}
