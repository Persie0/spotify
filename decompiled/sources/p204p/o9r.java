package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o9r {

    /* JADX INFO: renamed from: a */
    public final String f163122a;

    /* JADX INFO: renamed from: b */
    public final xfr f163123b;

    public o9r(String str, xfr xfrVar) {
        this.f163122a = str;
        this.f163123b = xfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r)) {
            return false;
        }
        o9r o9rVar = (o9r) obj;
        return this.f163122a.equals(o9rVar.f163122a) && this.f163123b == o9rVar.f163123b;
    }

    public final int hashCode() {
        return this.f163123b.hashCode() + ((xx61.f266882d.hashCode() + (this.f163122a.hashCode() * 31)) * 31);
    }
}
