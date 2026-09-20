package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hm51 {

    /* JADX INFO: renamed from: a */
    public final biz f92842a;

    /* JADX INFO: renamed from: b */
    public final biz f92843b;

    /* JADX INFO: renamed from: c */
    public final fyf f92844c;

    public hm51(biz bizVar, biz bizVar2, fyf fyfVar) {
        this.f92842a = bizVar;
        this.f92843b = bizVar2;
        this.f92844c = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm51)) {
            return false;
        }
        hm51 hm51Var = (hm51) obj;
        return this.f92842a.equals(hm51Var.f92842a) && this.f92843b.equals(hm51Var.f92843b) && this.f92844c.equals(hm51Var.f92844c);
    }

    public final int hashCode() {
        return this.f92844c.hashCode() + ((this.f92843b.hashCode() + (this.f92842a.hashCode() * 31)) * 31);
    }
}
