package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nn0 {

    /* JADX INFO: renamed from: a */
    public final int f156300a;

    /* JADX INFO: renamed from: b */
    public final String f156301b;

    public nn0(int i, String str) {
        this.f156300a = i;
        this.f156301b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn0)) {
            return false;
        }
        nn0 nn0Var = (nn0) obj;
        return this.f156300a == nn0Var.f156300a && this.f156301b.equals(nn0Var.f156301b);
    }

    public final int hashCode() {
        return this.f156301b.hashCode() + (Integer.hashCode(this.f156300a) * 31);
    }
}
