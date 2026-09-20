package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ol80 implements pl80 {

    /* JADX INFO: renamed from: a */
    public final int f166788a;

    public ol80(int i) {
        this.f166788a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol80) && this.f166788a == ((ol80) obj).f166788a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166788a);
    }
}
