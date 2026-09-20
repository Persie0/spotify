package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class amj {

    /* JADX INFO: renamed from: a */
    public final int f17148a;

    public amj(int i) {
        this.f17148a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof amj) && this.f17148a == ((amj) obj).f17148a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17148a);
    }
}
