package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s5z {

    /* JADX INFO: renamed from: a */
    public final String f205957a;

    /* JADX INFO: renamed from: b */
    public final String f205958b;

    /* JADX INFO: renamed from: c */
    public final int f205959c;

    public s5z(String str, String str2, int i) {
        this.f205957a = str;
        this.f205958b = str2;
        this.f205959c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5z)) {
            return false;
        }
        s5z s5zVar = (s5z) obj;
        return wj50.m88271j(this.f205957a, s5zVar.f205957a) && wj50.m88271j(this.f205958b, s5zVar.f205958b) && this.f205959c == s5zVar.f205959c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205959c) + s571.m77243b(this.f205957a.hashCode() * 31, 31, this.f205958b);
    }
}
