package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class x6m {

    /* JADX INFO: renamed from: a */
    public final Set f258711a;

    /* JADX INFO: renamed from: b */
    public final String f258712b;

    /* JADX INFO: renamed from: c */
    public final Set f258713c;

    /* JADX INFO: renamed from: d */
    public final n4m f258714d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x6m() {
        gbu gbuVar = gbu.f78413a;
        this(gbuVar, null, gbuVar, null);
    }

    /* JADX INFO: renamed from: a */
    public final Set m90100a() {
        return this.f258713c;
    }

    /* JADX INFO: renamed from: b */
    public final Set m90101b() {
        return this.f258711a;
    }

    /* JADX INFO: renamed from: c */
    public final n4m m90102c() {
        return this.f258714d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6m)) {
            return false;
        }
        x6m x6mVar = (x6m) obj;
        return wj50.m88271j(this.f258711a, x6mVar.f258711a) && wj50.m88271j(this.f258712b, x6mVar.f258712b) && wj50.m88271j(this.f258713c, x6mVar.f258713c) && wj50.m88271j(this.f258714d, x6mVar.f258714d);
    }

    public final int hashCode() {
        int iHashCode = this.f258711a.hashCode() * 31;
        String str = this.f258712b;
        int iM56830b = klh.m56830b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f258713c);
        n4m n4mVar = this.f258714d;
        return iM56830b + (n4mVar != null ? n4mVar.hashCode() : 0);
    }

    public x6m(Set set, String str, Set set2, n4m n4mVar) {
        this.f258711a = set;
        this.f258712b = str;
        this.f258713c = set2;
        this.f258714d = n4mVar;
    }
}
