package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z3c1 implements c4c1 {

    /* JADX INFO: renamed from: a */
    public final Throwable f278867a;

    public z3c1(Throwable th) {
        this.f278867a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3c1) && wj50.m88271j(this.f278867a, ((z3c1) obj).f278867a);
    }

    public final int hashCode() {
        return this.f278867a.hashCode();
    }
}
