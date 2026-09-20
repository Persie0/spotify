package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lql {

    /* JADX INFO: renamed from: a */
    public final String f136082a;

    /* JADX INFO: renamed from: b */
    public final String f136083b;

    /* JADX INFO: renamed from: c */
    public final b450 f136084c;

    /* JADX INFO: renamed from: d */
    public final boolean f136085d;

    public lql(String str, String str2, b450 b450Var, boolean z) {
        this.f136082a = str;
        this.f136083b = str2;
        this.f136084c = b450Var;
        this.f136085d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lql)) {
            return false;
        }
        lql lqlVar = (lql) obj;
        return wj50.m88271j(this.f136082a, lqlVar.f136082a) && wj50.m88271j(this.f136083b, lqlVar.f136083b) && wj50.m88271j(this.f136084c, lqlVar.f136084c) && this.f136085d == lqlVar.f136085d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136085d) + stz0.m79353g(s571.m77243b(this.f136082a.hashCode() * 31, 31, this.f136083b), 31, this.f136084c);
    }
}
