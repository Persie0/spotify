package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k6z {

    /* JADX INFO: renamed from: a */
    public final String f119867a;

    /* JADX INFO: renamed from: b */
    public final String f119868b;

    /* JADX INFO: renamed from: c */
    public final int f119869c;

    /* JADX INFO: renamed from: d */
    public final boolean f119870d;

    public k6z(String str, int i, String str2, boolean z) {
        this.f119867a = str;
        this.f119868b = str2;
        this.f119869c = i;
        this.f119870d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6z)) {
            return false;
        }
        k6z k6zVar = (k6z) obj;
        return wj50.m88271j(this.f119867a, k6zVar.f119867a) && wj50.m88271j(this.f119868b, k6zVar.f119868b) && this.f119869c == k6zVar.f119869c && this.f119870d == k6zVar.f119870d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119870d) + mt60.m62800g(this.f119869c, s571.m77243b(this.f119867a.hashCode() * 31, 31, this.f119868b), 31);
    }
}
