package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rs90 {

    /* JADX INFO: renamed from: a */
    public final String f202236a;

    /* JADX INFO: renamed from: b */
    public final String f202237b;

    /* JADX INFO: renamed from: c */
    public final String f202238c;

    /* JADX INFO: renamed from: d */
    public final boolean f202239d;

    public rs90(String str, String str2, String str3, boolean z) {
        this.f202236a = str;
        this.f202237b = str2;
        this.f202238c = str3;
        this.f202239d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs90)) {
            return false;
        }
        rs90 rs90Var = (rs90) obj;
        return wj50.m88271j(this.f202236a, rs90Var.f202236a) && wj50.m88271j(this.f202237b, rs90Var.f202237b) && wj50.m88271j(this.f202238c, rs90Var.f202238c) && this.f202239d == rs90Var.f202239d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f202239d) + s571.m77243b(s571.m77243b(this.f202236a.hashCode() * 31, 31, this.f202237b), 31, this.f202238c);
    }
}
