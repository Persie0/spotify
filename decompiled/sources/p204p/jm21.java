package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jm21 {

    /* JADX INFO: renamed from: a */
    public final String f113738a;

    /* JADX INFO: renamed from: b */
    public final boolean f113739b;

    /* JADX INFO: renamed from: c */
    public final am81 f113740c;

    public jm21(String str, boolean z, am81 am81Var) {
        this.f113738a = str;
        this.f113739b = z;
        this.f113740c = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm21)) {
            return false;
        }
        jm21 jm21Var = (jm21) obj;
        return wj50.m88271j(this.f113738a, jm21Var.f113738a) && this.f113739b == jm21Var.f113739b && wj50.m88271j(this.f113740c, jm21Var.f113740c);
    }

    public final int hashCode() {
        return this.f113740c.hashCode() + s571.m77245d(this.f113738a.hashCode() * 31, 31, this.f113739b);
    }
}
