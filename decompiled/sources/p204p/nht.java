package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nht {

    /* JADX INFO: renamed from: a */
    public final int f154074a;

    public nht(int i) {
        this.f154074a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nht) && this.f154074a == ((nht) obj).f154074a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154074a) * 31;
    }
}
