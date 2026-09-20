package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y640 implements hwf {

    /* JADX INFO: renamed from: a */
    public final a740 f269689a;

    public y640(a740 a740Var) {
        this.f269689a = a740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y640) && this.f269689a.equals(((y640) obj).f269689a);
    }

    public final int hashCode() {
        return this.f269689a.hashCode();
    }
}
