package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a9c0 {

    /* JADX INFO: renamed from: a */
    public final long f13538a;

    /* JADX INFO: renamed from: b */
    public final String f13539b;

    public a9c0(long j, String str) {
        this.f13538a = j;
        this.f13539b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9c0)) {
            return false;
        }
        a9c0 a9c0Var = (a9c0) obj;
        return this.f13538a == a9c0Var.f13538a && wj50.m88271j(this.f13539b, a9c0Var.f13539b);
    }

    public final int hashCode() {
        return this.f13539b.hashCode() + (Long.hashCode(this.f13538a) * 31);
    }
}
