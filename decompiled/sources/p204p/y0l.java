package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f268001a;

    public y0l(boolean z) {
        this.f268001a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0l) && this.f268001a == ((y0l) obj).f268001a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268001a);
    }
}
