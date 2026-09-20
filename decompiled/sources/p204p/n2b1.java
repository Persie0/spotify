package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n2b1 {

    /* JADX INFO: renamed from: a */
    public final String f149732a;

    /* JADX INFO: renamed from: b */
    public final String f149733b;

    public n2b1(String str, String str2) {
        this.f149732a = str;
        this.f149733b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2b1)) {
            return false;
        }
        n2b1 n2b1Var = (n2b1) obj;
        return wj50.m88271j(this.f149732a, n2b1Var.f149732a) && wj50.m88271j(this.f149733b, n2b1Var.f149733b);
    }

    public final int hashCode() {
        return this.f149733b.hashCode() + (this.f149732a.hashCode() * 31);
    }
}
