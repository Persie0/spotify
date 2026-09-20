package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a88 {

    /* JADX INFO: renamed from: a */
    public final v851 f13214a;

    /* JADX INFO: renamed from: b */
    public final int f13215b;

    /* JADX INFO: renamed from: c */
    public final boolean f13216c;

    /* JADX INFO: renamed from: d */
    public final String f13217d;

    public a88(v851 v851Var, int i, boolean z, String str) {
        this.f13214a = v851Var;
        this.f13215b = i;
        this.f13216c = z;
        this.f13217d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a88)) {
            return false;
        }
        a88 a88Var = (a88) obj;
        return wj50.m88271j(this.f13214a, a88Var.f13214a) && this.f13215b == a88Var.f13215b && this.f13216c == a88Var.f13216c && wj50.m88271j(this.f13217d, a88Var.f13217d);
    }

    public final int hashCode() {
        return this.f13217d.hashCode() + s571.m77245d(mt60.m62800g(this.f13215b, this.f13214a.hashCode() * 31, 31), 31, this.f13216c);
    }
}
