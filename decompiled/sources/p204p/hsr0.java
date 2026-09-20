package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hsr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final String f94787a;

    /* JADX INFO: renamed from: b */
    public final String f94788b;

    /* JADX INFO: renamed from: c */
    public final boolean f94789c;

    public hsr0(String str, String str2, boolean z) {
        this.f94787a = str;
        this.f94788b = str2;
        this.f94789c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsr0)) {
            return false;
        }
        hsr0 hsr0Var = (hsr0) obj;
        return wj50.m88271j(this.f94787a, hsr0Var.f94787a) && wj50.m88271j(this.f94788b, hsr0Var.f94788b) && this.f94789c == hsr0Var.f94789c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94789c) + s571.m77243b(this.f94787a.hashCode() * 31, 31, this.f94788b);
    }
}
