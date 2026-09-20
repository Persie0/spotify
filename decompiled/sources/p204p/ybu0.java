package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ybu0 implements acu0 {

    /* JADX INFO: renamed from: a */
    public final nqj0 f271248a;

    public ybu0(nqj0 nqj0Var) {
        this.f271248a = nqj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybu0) && wj50.m88271j(this.f271248a, ((ybu0) obj).f271248a);
    }

    public final int hashCode() {
        return this.f271248a.hashCode();
    }

    public final String toString() {
        return "NotReachable(reason=" + this.f271248a + ")";
    }
}
