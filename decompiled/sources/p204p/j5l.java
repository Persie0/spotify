package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j5l {

    /* JADX INFO: renamed from: a */
    public final String f108995a;

    /* JADX INFO: renamed from: b */
    public final k5l f108996b;

    /* JADX INFO: renamed from: c */
    public final boolean f108997c;

    /* JADX INFO: renamed from: d */
    public final boolean f108998d;

    /* JADX INFO: renamed from: e */
    public final boolean f108999e;

    public j5l(String str, k5l k5lVar, boolean z, boolean z2, boolean z3) {
        this.f108995a = str;
        this.f108996b = k5lVar;
        this.f108997c = z;
        this.f108998d = z2;
        this.f108999e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5l)) {
            return false;
        }
        j5l j5lVar = (j5l) obj;
        return wj50.m88271j(this.f108995a, j5lVar.f108995a) && wj50.m88271j(this.f108996b, j5lVar.f108996b) && this.f108997c == j5lVar.f108997c && this.f108998d == j5lVar.f108998d && this.f108999e == j5lVar.f108999e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108999e) + s571.m77245d(s571.m77245d((this.f108996b.hashCode() + (this.f108995a.hashCode() * 31)) * 31, 31, this.f108997c), 31, this.f108998d);
    }
}
