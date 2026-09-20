package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d2v0 {

    /* JADX INFO: renamed from: a */
    public final String f44675a;

    /* JADX INFO: renamed from: b */
    public final String f44676b;

    /* JADX INFO: renamed from: c */
    public final int f44677c;

    public d2v0(String str, String str2, int i) {
        this.f44675a = str;
        this.f44676b = str2;
        this.f44677c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2v0)) {
            return false;
        }
        d2v0 d2v0Var = (d2v0) obj;
        return wj50.m88271j(this.f44675a, d2v0Var.f44675a) && wj50.m88271j(this.f44676b, d2v0Var.f44676b) && this.f44677c == d2v0Var.f44677c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44677c) + s571.m77243b(this.f44675a.hashCode() * 31, 31, this.f44676b);
    }
}
