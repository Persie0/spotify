package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k4b {

    /* JADX INFO: renamed from: a */
    public final whj0 f119170a;

    public k4b(whj0 whj0Var) {
        this.f119170a = whj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4b) && wj50.m88271j(this.f119170a, ((k4b) obj).f119170a);
    }

    public final int hashCode() {
        whj0 whj0Var = this.f119170a;
        if (whj0Var != null) {
            return whj0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f119170a + ')';
    }
}
