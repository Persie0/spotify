package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o1b {

    /* JADX INFO: renamed from: a */
    public final int f160682a;

    /* JADX INFO: renamed from: b */
    public final int f160683b;

    public o1b(int i, int i2) {
        this.f160682a = i;
        this.f160683b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1b)) {
            return false;
        }
        o1b o1bVar = (o1b) obj;
        return this.f160682a == o1bVar.f160682a && this.f160683b == o1bVar.f160683b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f160683b) + (Integer.hashCode(this.f160682a) * 31);
    }
}
