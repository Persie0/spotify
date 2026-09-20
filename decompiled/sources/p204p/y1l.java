package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final int f268283a;

    public y1l(int i) {
        this.f268283a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1l) && this.f268283a == ((y1l) obj).f268283a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f268283a);
    }
}
