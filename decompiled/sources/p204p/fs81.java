package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fs81 {

    /* JADX INFO: renamed from: a */
    public final String f72804a;

    /* JADX INFO: renamed from: b */
    public final int f72805b;

    public fs81(String str, int i) {
        this.f72804a = str;
        this.f72805b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs81)) {
            return false;
        }
        fs81 fs81Var = (fs81) obj;
        return this.f72804a.equals(fs81Var.f72804a) && this.f72805b == fs81Var.f72805b;
    }

    public final int hashCode() {
        int iHashCode = this.f72804a.hashCode() * 31;
        int i = this.f72805b;
        return iHashCode + (i == 0 ? 0 : edb.m38547C(i));
    }
}
