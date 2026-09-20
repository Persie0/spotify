package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x791 {

    /* JADX INFO: renamed from: a */
    public final long f258861a;

    /* JADX INFO: renamed from: b */
    public final String f258862b;

    public x791(long j, String str) {
        this.f258861a = j;
        this.f258862b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x791)) {
            return false;
        }
        x791 x791Var = (x791) obj;
        return this.f258861a == x791Var.f258861a && wj50.m88271j(this.f258862b, x791Var.f258862b);
    }

    public final int hashCode() {
        return this.f258862b.hashCode() + (Long.hashCode(this.f258861a) * 31);
    }
}
