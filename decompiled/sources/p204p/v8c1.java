package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v8c1 {

    /* JADX INFO: renamed from: a */
    public final String f238471a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f238472b;

    public v8c1(String str, z5c0 z5c0Var) {
        this.f238471a = str;
        this.f238472b = z5c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c1)) {
            return false;
        }
        v8c1 v8c1Var = (v8c1) obj;
        return wj50.m88271j(this.f238471a, v8c1Var.f238471a) && this.f238472b == v8c1Var.f238472b;
    }

    public final int hashCode() {
        return this.f238472b.hashCode() + (this.f238471a.hashCode() * 31);
    }
}
