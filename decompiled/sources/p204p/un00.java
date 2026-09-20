package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class un00 implements wn00 {

    /* JADX INFO: renamed from: a */
    public final ojc f231996a;

    public un00(ojc ojcVar) {
        this.f231996a = ojcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un00) && wj50.m88271j(this.f231996a, ((un00) obj).f231996a);
    }

    public final int hashCode() {
        return this.f231996a.hashCode();
    }
}
