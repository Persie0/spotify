package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f257221a;

    public x1l(boolean z) {
        this.f257221a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1l) && this.f257221a == ((x1l) obj).f257221a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257221a);
    }
}
