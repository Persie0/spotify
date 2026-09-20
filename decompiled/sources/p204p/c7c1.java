package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c7c1 {

    /* JADX INFO: renamed from: a */
    public final String f34850a;

    /* JADX INFO: renamed from: b */
    public final String f34851b;

    /* JADX INFO: renamed from: c */
    public final boolean f34852c;

    public c7c1(String str, String str2, boolean z) {
        this.f34850a = str;
        this.f34851b = str2;
        this.f34852c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7c1)) {
            return false;
        }
        c7c1 c7c1Var = (c7c1) obj;
        return wj50.m88271j(this.f34850a, c7c1Var.f34850a) && wj50.m88271j(this.f34851b, c7c1Var.f34851b) && this.f34852c == c7c1Var.f34852c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34852c) + s571.m77243b(this.f34850a.hashCode() * 31, 31, this.f34851b);
    }
}
