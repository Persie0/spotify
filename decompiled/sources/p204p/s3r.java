package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s3r implements t3r {

    /* JADX INFO: renamed from: a */
    public final String f205320a;

    /* JADX INFO: renamed from: b */
    public final xj70 f205321b;

    public s3r(String str, xj70 xj70Var) {
        this.f205320a = str;
        this.f205321b = xj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3r)) {
            return false;
        }
        s3r s3rVar = (s3r) obj;
        return wj50.m88271j(this.f205320a, s3rVar.f205320a) && wj50.m88271j(this.f205321b, s3rVar.f205321b);
    }

    public final int hashCode() {
        return this.f205321b.hashCode() + (this.f205320a.hashCode() * 31);
    }
}
