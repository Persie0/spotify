package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ul8 {

    /* JADX INFO: renamed from: a */
    public final boolean f231465a;

    /* JADX INFO: renamed from: b */
    public final sl8 f231466b;

    /* JADX INFO: renamed from: c */
    public final long f231467c;

    public ul8(boolean z, sl8 sl8Var, long j) {
        this.f231465a = z;
        this.f231466b = sl8Var;
        this.f231467c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul8)) {
            return false;
        }
        ul8 ul8Var = (ul8) obj;
        if (this.f231465a != ul8Var.f231465a || !wj50.m88271j(this.f231466b, ul8Var.f231466b)) {
            return false;
        }
        long j = ul8Var.f231467c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f231467c, j);
    }

    public final int hashCode() {
        int iHashCode = (this.f231466b.hashCode() + (Boolean.hashCode(this.f231465a) * 31)) * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f231467c) + iHashCode;
    }
}
