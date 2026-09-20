package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class za51 implements cb51 {

    /* JADX INFO: renamed from: a */
    public final int f280985a;

    public za51(int i) {
        this.f280985a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za51) && this.f280985a == ((za51) obj).f280985a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280985a);
    }
}
