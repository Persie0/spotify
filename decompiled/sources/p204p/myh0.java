package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class myh0 {

    /* JADX INFO: renamed from: a */
    public final long f148465a;

    /* JADX INFO: renamed from: b */
    public final long f148466b;

    /* JADX INFO: renamed from: c */
    public final n5h1 f148467c;

    public myh0(long j, long j2, n5h1 n5h1Var) {
        this.f148465a = j;
        this.f148466b = j2;
        this.f148467c = n5h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myh0)) {
            return false;
        }
        myh0 myh0Var = (myh0) obj;
        return this.f148465a == myh0Var.f148465a && this.f148466b == myh0Var.f148466b && wj50.m88271j(this.f148467c, myh0Var.f148467c);
    }

    public final int hashCode() {
        return this.f148467c.hashCode() + dq60.m36605e(Long.hashCode(this.f148465a) * 31, this.f148466b, 31);
    }
}
