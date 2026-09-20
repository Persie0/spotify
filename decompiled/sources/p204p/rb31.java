package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rb31 {

    /* JADX INFO: renamed from: a */
    public final String f197432a;

    /* JADX INFO: renamed from: b */
    public final boolean f197433b;

    public rb31(String str, boolean z) {
        this.f197432a = str;
        this.f197433b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb31)) {
            return false;
        }
        rb31 rb31Var = (rb31) obj;
        return wj50.m88271j(this.f197432a, rb31Var.f197432a) && this.f197433b == rb31Var.f197433b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197433b) + (this.f197432a.hashCode() * 31);
    }
}
