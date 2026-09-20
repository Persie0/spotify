package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kmu {

    /* JADX INFO: renamed from: a */
    public final boolean f124212a;

    public kmu(boolean z) {
        this.f124212a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmu) && this.f124212a == ((kmu) obj).f124212a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124212a);
    }
}
