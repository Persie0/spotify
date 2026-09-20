package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l7g0 implements p7g0 {

    /* JADX INFO: renamed from: a */
    public final int f130646a;

    public l7g0(int i) {
        this.f130646a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7g0) && this.f130646a == ((l7g0) obj).f130646a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130646a);
    }
}
