package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bov {

    /* JADX INFO: renamed from: a */
    public final String f29255a;

    /* JADX INFO: renamed from: b */
    public final int f29256b;

    /* JADX INFO: renamed from: c */
    public final String f29257c;

    /* JADX INFO: renamed from: d */
    public final String f29258d;

    /* JADX INFO: renamed from: e */
    public final hug1 f29259e;

    public bov(String str, int i, String str2, String str3, hug1 hug1Var) {
        this.f29255a = str;
        this.f29256b = i;
        this.f29257c = str2;
        this.f29258d = str3;
        this.f29259e = hug1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bov)) {
            return false;
        }
        bov bovVar = (bov) obj;
        return wj50.m88271j(this.f29255a, bovVar.f29255a) && this.f29256b == bovVar.f29256b && wj50.m88271j(this.f29257c, bovVar.f29257c) && wj50.m88271j(this.f29258d, bovVar.f29258d) && wj50.m88271j(this.f29259e, bovVar.f29259e);
    }

    public final int hashCode() {
        return this.f29259e.hashCode() + s571.m77243b(s571.m77243b(f710.m40938f(this.f29256b, this.f29255a.hashCode() * 31, 31), 31, this.f29257c), 31, this.f29258d);
    }
}
