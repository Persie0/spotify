package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class db2 implements hb2 {

    /* JADX INFO: renamed from: a */
    public final ib2 f47173a;

    public db2(ib2 ib2Var) {
        this.f47173a = ib2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db2) && wj50.m88271j(this.f47173a, ((db2) obj).f47173a);
    }

    public final int hashCode() {
        return this.f47173a.hashCode();
    }
}
