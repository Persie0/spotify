package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xp2 implements yp2 {

    /* JADX INFO: renamed from: a */
    public final fyf f264410a;

    public xp2(fyf fyfVar) {
        this.f264410a = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp2) && this.f264410a.equals(((xp2) obj).f264410a);
    }

    public final int hashCode() {
        return this.f264410a.hashCode();
    }
}
