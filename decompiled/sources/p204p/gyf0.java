package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gyf0 {

    /* JADX INFO: renamed from: a */
    public final String f85599a;

    /* JADX INFO: renamed from: b */
    public final myf0 f85600b;

    public gyf0(String str, myf0 myf0Var) {
        this.f85599a = str;
        this.f85600b = myf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyf0)) {
            return false;
        }
        gyf0 gyf0Var = (gyf0) obj;
        return wj50.m88271j(this.f85599a, gyf0Var.f85599a) && wj50.m88271j(this.f85600b, gyf0Var.f85600b);
    }

    public final int hashCode() {
        return this.f85600b.hashCode() + (this.f85599a.hashCode() * 31);
    }
}
