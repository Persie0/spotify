package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class nqq {

    /* JADX INFO: renamed from: a */
    public final String f157307a;

    /* JADX INFO: renamed from: b */
    public final String f157308b;

    /* JADX INFO: renamed from: c */
    public final List f157309c;

    /* JADX INFO: renamed from: d */
    public final List f157310d;

    /* JADX INFO: renamed from: e */
    public final gqq f157311e;

    /* JADX INFO: renamed from: f */
    public final gqq f157312f;

    /* JADX INFO: renamed from: g */
    public final boolean f157313g;

    /* JADX INFO: renamed from: h */
    public final int f157314h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nqq(String str, String str2, ArrayList arrayList, ArrayList arrayList2, gqq gqqVar, gqq gqqVar2, boolean z, int i) {
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) != 0 ? "" : str2;
        int i2 = i & 4;
        lau lauVar = lau.f131415a;
        this(str3, str4, i2 != 0 ? lauVar : arrayList, (i & 8) != 0 ? lauVar : arrayList2, (i & 16) != 0 ? new gqq() : gqqVar, (i & 32) != 0 ? new gqq() : gqqVar2, (i & 64) != 0 ? false : z, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqq)) {
            return false;
        }
        nqq nqqVar = (nqq) obj;
        return wj50.m88271j(this.f157307a, nqqVar.f157307a) && wj50.m88271j(this.f157308b, nqqVar.f157308b) && wj50.m88271j(this.f157309c, nqqVar.f157309c) && wj50.m88271j(this.f157310d, nqqVar.f157310d) && wj50.m88271j(this.f157311e, nqqVar.f157311e) && wj50.m88271j(this.f157312f, nqqVar.f157312f) && this.f157313g == nqqVar.f157313g && this.f157314h == nqqVar.f157314h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157314h) + s571.m77245d((this.f157312f.hashCode() + ((this.f157311e.hashCode() + s571.m77244c(s571.m77244c(s571.m77243b(this.f157307a.hashCode() * 31, 31, this.f157308b), 31, this.f157309c), 31, this.f157310d)) * 31)) * 31, 31, this.f157313g);
    }

    public nqq(String str, String str2, List list, List list2, gqq gqqVar, gqq gqqVar2, boolean z, int i) {
        this.f157307a = str;
        this.f157308b = str2;
        this.f157309c = list;
        this.f157310d = list2;
        this.f157311e = gqqVar;
        this.f157312f = gqqVar2;
        this.f157313g = z;
        this.f157314h = i;
    }
}
