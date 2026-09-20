package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rv51 {

    /* JADX INFO: renamed from: a */
    public final int f203003a;

    public rv51(int i) {
        this.f203003a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv51) && this.f203003a == ((rv51) obj).f203003a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203003a);
    }
}
