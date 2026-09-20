package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d2l implements h2l {

    /* JADX INFO: renamed from: a */
    public final int f44578a;

    public d2l(int i) {
        this.f44578a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2l) && this.f44578a == ((d2l) obj).f44578a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44578a);
    }
}
