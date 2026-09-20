package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lmv {

    /* JADX INFO: renamed from: a */
    public final String f135034a;

    /* JADX INFO: renamed from: b */
    public final String f135035b;

    /* JADX INFO: renamed from: c */
    public final String f135036c;

    /* JADX INFO: renamed from: d */
    public final int f135037d;

    /* JADX INFO: renamed from: e */
    public final boolean f135038e;

    public lmv(int i, String str, String str2, boolean z, String str3) {
        this.f135034a = str;
        this.f135035b = str2;
        this.f135036c = str3;
        this.f135037d = i;
        this.f135038e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmv)) {
            return false;
        }
        lmv lmvVar = (lmv) obj;
        return wj50.m88271j(this.f135034a, lmvVar.f135034a) && wj50.m88271j(this.f135035b, lmvVar.f135035b) && wj50.m88271j(this.f135036c, lmvVar.f135036c) && this.f135037d == lmvVar.f135037d && this.f135038e == lmvVar.f135038e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135038e) + mt60.m62800g(this.f135037d, s571.m77243b(s571.m77243b(this.f135034a.hashCode() * 31, 31, this.f135035b), 31, this.f135036c), 31);
    }
}
