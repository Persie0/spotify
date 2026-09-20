package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fqz extends iqz {

    /* JADX INFO: renamed from: a */
    public final int f72313a;

    public fqz(int i) {
        this.f72313a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqz) && this.f72313a == ((fqz) obj).f72313a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72313a);
    }
}
