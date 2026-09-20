package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cs10 {

    /* JADX INFO: renamed from: a */
    public final int f41439a;

    public cs10(int i) {
        this.f41439a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs10) && this.f41439a == ((cs10) obj).f41439a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41439a);
    }
}
