package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q6u0 {

    /* JADX INFO: renamed from: a */
    public final int f185928a;

    public q6u0(int i) {
        this.f185928a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6u0) && this.f185928a == ((q6u0) obj).f185928a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f185928a);
    }
}
