package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f225139a;

    /* JADX INFO: renamed from: b */
    public final double f225140b;

    public tz31(String str, double d) {
        this.f225139a = str;
        this.f225140b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz31)) {
            return false;
        }
        tz31 tz31Var = (tz31) obj;
        return wj50.m88271j(this.f225139a, tz31Var.f225139a) && Double.compare(this.f225140b, tz31Var.f225140b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f225140b) + (this.f225139a.hashCode() * 31);
    }
}
