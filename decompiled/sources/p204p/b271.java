package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b271 {

    /* JADX INFO: renamed from: a */
    public final udb0 f22511a;

    /* JADX INFO: renamed from: b */
    public final int f22512b;

    /* JADX INFO: renamed from: c */
    public final boolean f22513c;

    public b271(udb0 udb0Var, int i, boolean z) {
        this.f22511a = udb0Var;
        this.f22512b = i;
        this.f22513c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b271)) {
            return false;
        }
        b271 b271Var = (b271) obj;
        return this.f22511a == b271Var.f22511a && this.f22512b == b271Var.f22512b && this.f22513c == b271Var.f22513c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22513c) + f710.m40938f(this.f22512b, this.f22511a.hashCode() * 31, 31);
    }
}
