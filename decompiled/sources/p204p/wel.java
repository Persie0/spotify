package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wel implements ffl {

    /* JADX INFO: renamed from: a */
    public final int f250579a;

    public wel(int i) {
        this.f250579a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wel) && this.f250579a == ((wel) obj).f250579a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250579a);
    }
}
