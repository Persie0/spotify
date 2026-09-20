package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n9e0 extends h1h1 {

    /* JADX INFO: renamed from: b */
    public final String f151782b;

    /* JADX INFO: renamed from: c */
    public final boolean f151783c;

    public n9e0(String str, boolean z) {
        this.f151782b = str;
        this.f151783c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9e0)) {
            return false;
        }
        n9e0 n9e0Var = (n9e0) obj;
        return wj50.m88271j(this.f151782b, n9e0Var.f151782b) && this.f151783c == n9e0Var.f151783c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151783c) + (this.f151782b.hashCode() * 31);
    }
}
