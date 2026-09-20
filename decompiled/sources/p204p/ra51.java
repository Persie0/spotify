package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ra51 implements cb51 {

    /* JADX INFO: renamed from: a */
    public final int f197202a;

    public ra51(int i) {
        this.f197202a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra51) && this.f197202a == ((ra51) obj).f197202a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197202a);
    }
}
