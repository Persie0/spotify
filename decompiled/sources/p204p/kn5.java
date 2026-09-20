package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f124311a;

    /* JADX INFO: renamed from: b */
    public final jk5 f124312b;

    public kn5(String str, jk5 jk5Var) {
        this.f124311a = str;
        this.f124312b = jk5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn5)) {
            return false;
        }
        kn5 kn5Var = (kn5) obj;
        return wj50.m88271j(this.f124311a, kn5Var.f124311a) && this.f124312b.equals(kn5Var.f124312b);
    }

    public final int hashCode() {
        return this.f124312b.f113214a.hashCode() + s571.m77245d(this.f124311a.hashCode() * 31, 31, true);
    }
}
