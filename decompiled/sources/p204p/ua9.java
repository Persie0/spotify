package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ua9 {

    /* JADX INFO: renamed from: a */
    public final String f228431a;

    /* JADX INFO: renamed from: b */
    public final l1p0 f228432b;

    public ua9(String str, l1p0 l1p0Var) {
        this.f228431a = str;
        this.f228432b = l1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua9)) {
            return false;
        }
        ua9 ua9Var = (ua9) obj;
        return wj50.m88271j(this.f228431a, ua9Var.f228431a) && wj50.m88271j(this.f228432b, ua9Var.f228432b);
    }

    public final int hashCode() {
        return this.f228432b.hashCode() + (this.f228431a.hashCode() * 31);
    }
}
