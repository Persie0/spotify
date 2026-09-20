package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ko2 {

    /* JADX INFO: renamed from: a */
    public final String f124501a;

    /* JADX INFO: renamed from: b */
    public final boolean f124502b;

    /* JADX INFO: renamed from: c */
    public final String f124503c;

    public ko2(String str, String str2, boolean z) {
        this.f124501a = str;
        this.f124502b = z;
        this.f124503c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko2)) {
            return false;
        }
        ko2 ko2Var = (ko2) obj;
        return wj50.m88271j(this.f124501a, ko2Var.f124501a) && this.f124502b == ko2Var.f124502b && wj50.m88271j(this.f124503c, ko2Var.f124503c);
    }

    public final int hashCode() {
        return this.f124503c.hashCode() + s571.m77245d(this.f124501a.hashCode() * 31, 31, this.f124502b);
    }
}
