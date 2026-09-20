package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q7q0 implements u7q0 {

    /* JADX INFO: renamed from: a */
    public final int f186163a;

    public q7q0(int i) {
        this.f186163a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7q0) && this.f186163a == ((q7q0) obj).f186163a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f186163a);
    }
}
