package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mgw implements ngw {

    /* JADX INFO: renamed from: a */
    public final int f143638a;

    public mgw(int i) {
        this.f143638a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgw) && this.f143638a == ((mgw) obj).f143638a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143638a);
    }
}
