package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hxw0 {

    /* JADX INFO: renamed from: a */
    public final String f96326a;

    /* JADX INFO: renamed from: b */
    public final String f96327b;

    public hxw0(String str, String str2) {
        this.f96326a = str;
        this.f96327b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxw0)) {
            return false;
        }
        hxw0 hxw0Var = (hxw0) obj;
        return wj50.m88271j(this.f96326a, hxw0Var.f96326a) && wj50.m88271j(this.f96327b, hxw0Var.f96327b);
    }

    public final int hashCode() {
        return this.f96327b.hashCode() + (this.f96326a.hashCode() * 31);
    }
}
