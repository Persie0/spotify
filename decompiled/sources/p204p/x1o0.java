package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x1o0 {

    /* JADX INFO: renamed from: a */
    public final String f257240a;

    /* JADX INFO: renamed from: b */
    public final String f257241b;

    public x1o0(String str, String str2) {
        this.f257240a = str;
        this.f257241b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1o0)) {
            return false;
        }
        x1o0 x1o0Var = (x1o0) obj;
        return wj50.m88271j(this.f257240a, x1o0Var.f257240a) && wj50.m88271j(this.f257241b, x1o0Var.f257241b);
    }

    public final int hashCode() {
        return this.f257241b.hashCode() + (this.f257240a.hashCode() * 31);
    }
}
