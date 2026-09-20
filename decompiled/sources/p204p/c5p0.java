package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c5p0 extends d5p0 {

    /* JADX INFO: renamed from: a */
    public final int f34232a;

    /* JADX INFO: renamed from: b */
    public final String f34233b;

    public c5p0(int i, String str) {
        this.f34232a = i;
        this.f34233b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5p0)) {
            return false;
        }
        c5p0 c5p0Var = (c5p0) obj;
        return this.f34232a == c5p0Var.f34232a && wj50.m88271j(this.f34233b, c5p0Var.f34233b);
    }

    public final int hashCode() {
        return this.f34233b.hashCode() + (edb.m38547C(this.f34232a) * 31);
    }
}
