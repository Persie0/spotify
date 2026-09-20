package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e8d0 {

    /* JADX INFO: renamed from: a */
    public final String f57144a;

    /* JADX INFO: renamed from: b */
    public final int f57145b;

    public e8d0(String str, int i) {
        this.f57144a = str;
        this.f57145b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8d0)) {
            return false;
        }
        e8d0 e8d0Var = (e8d0) obj;
        return this.f57144a.equals(e8d0Var.f57144a) && this.f57145b == e8d0Var.f57145b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f57145b) + (this.f57144a.hashCode() * 31);
    }
}
