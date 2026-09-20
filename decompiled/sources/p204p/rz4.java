package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rz4 {

    /* JADX INFO: renamed from: a */
    public final String f204054a;

    /* JADX INFO: renamed from: b */
    public final int f204055b;

    /* JADX INFO: renamed from: c */
    public final String f204056c;

    public rz4(String str, int i, String str2) {
        this.f204054a = str;
        this.f204055b = i;
        this.f204056c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz4)) {
            return false;
        }
        rz4 rz4Var = (rz4) obj;
        return wj50.m88271j(this.f204054a, rz4Var.f204054a) && this.f204055b == rz4Var.f204055b && wj50.m88271j(this.f204056c, rz4Var.f204056c);
    }

    public final int hashCode() {
        return this.f204056c.hashCode() + f710.m40938f(this.f204055b, this.f204054a.hashCode() * 31, 31);
    }
}
