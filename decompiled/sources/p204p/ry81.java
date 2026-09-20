package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ry81 extends ty81 {

    /* JADX INFO: renamed from: a */
    public final int f203857a;

    public ry81(int i) {
        this.f203857a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry81) && this.f203857a == ((ry81) obj).f203857a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203857a);
    }
}
