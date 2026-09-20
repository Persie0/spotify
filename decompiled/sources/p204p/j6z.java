package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j6z {

    /* JADX INFO: renamed from: a */
    public final String f109430a;

    /* JADX INFO: renamed from: b */
    public final String f109431b;

    /* JADX INFO: renamed from: c */
    public final int f109432c;

    /* JADX INFO: renamed from: d */
    public final boolean f109433d;

    public j6z(String str, int i, String str2, boolean z) {
        this.f109430a = str;
        this.f109431b = str2;
        this.f109432c = i;
        this.f109433d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6z)) {
            return false;
        }
        j6z j6zVar = (j6z) obj;
        return wj50.m88271j(this.f109430a, j6zVar.f109430a) && wj50.m88271j(this.f109431b, j6zVar.f109431b) && this.f109432c == j6zVar.f109432c && this.f109433d == j6zVar.f109433d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109433d) + mt60.m62800g(this.f109432c, s571.m77243b(this.f109430a.hashCode() * 31, 31, this.f109431b), 31);
    }
}
