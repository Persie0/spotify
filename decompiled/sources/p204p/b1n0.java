package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b1n0 {

    /* JADX INFO: renamed from: a */
    public final String f22378a;

    /* JADX INFO: renamed from: b */
    public final int f22379b;

    public b1n0(String str, int i) {
        this.f22378a = str;
        this.f22379b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1n0)) {
            return false;
        }
        b1n0 b1n0Var = (b1n0) obj;
        return this.f22378a.equals(b1n0Var.f22378a) && this.f22379b == b1n0Var.f22379b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f22379b) + (this.f22378a.hashCode() * 31);
    }
}
