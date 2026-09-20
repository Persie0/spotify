package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nre {

    /* JADX INFO: renamed from: a */
    public final String f157513a;

    /* JADX INFO: renamed from: b */
    public final b450 f157514b;

    /* JADX INFO: renamed from: c */
    public final String f157515c;

    public nre(String str, b450 b450Var, String str2) {
        this.f157513a = str;
        this.f157514b = b450Var;
        this.f157515c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nre)) {
            return false;
        }
        nre nreVar = (nre) obj;
        return wj50.m88271j(this.f157513a, nreVar.f157513a) && wj50.m88271j(this.f157514b, nreVar.f157514b) && wj50.m88271j(this.f157515c, nreVar.f157515c);
    }

    public final int hashCode() {
        return this.f157515c.hashCode() + stz0.m79353g(this.f157513a.hashCode() * 31, 31, this.f157514b);
    }
}
