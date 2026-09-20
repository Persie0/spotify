package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q0c0 implements s0c0 {

    /* JADX INFO: renamed from: a */
    public final int f183953a;

    public q0c0(int i) {
        this.f183953a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0c0) && this.f183953a == ((q0c0) obj).f183953a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f183953a);
    }
}
