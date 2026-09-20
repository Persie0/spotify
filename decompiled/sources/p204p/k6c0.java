package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k6c0 extends fpg1 {

    /* JADX INFO: renamed from: c */
    public final String f119719c;

    /* JADX INFO: renamed from: d */
    public final z5c0 f119720d;

    /* JADX INFO: renamed from: e */
    public final boolean f119721e;

    public k6c0(String str, z5c0 z5c0Var, boolean z) {
        this.f119719c = str;
        this.f119720d = z5c0Var;
        this.f119721e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6c0)) {
            return false;
        }
        k6c0 k6c0Var = (k6c0) obj;
        return wj50.m88271j(this.f119719c, k6c0Var.f119719c) && this.f119720d == k6c0Var.f119720d && this.f119721e == k6c0Var.f119721e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119721e) + ((this.f119720d.hashCode() + (this.f119719c.hashCode() * 31)) * 31);
    }
}
