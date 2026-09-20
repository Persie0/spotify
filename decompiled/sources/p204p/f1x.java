package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f1x implements x2x {

    /* JADX INFO: renamed from: a */
    public final String f64995a;

    /* JADX INFO: renamed from: b */
    public final Throwable f64996b;

    public f1x(String str, Throwable th) {
        this.f64995a = str;
        this.f64996b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1x)) {
            return false;
        }
        f1x f1xVar = (f1x) obj;
        return wj50.m88271j(this.f64995a, f1xVar.f64995a) && wj50.m88271j(this.f64996b, f1xVar.f64996b);
    }

    public final int hashCode() {
        return this.f64996b.hashCode() + (this.f64995a.hashCode() * 31);
    }
}
