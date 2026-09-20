package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b6z extends d6z {

    /* JADX INFO: renamed from: a */
    public final hs61 f24076a;

    public b6z(hs61 hs61Var) {
        this.f24076a = hs61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6z) && this.f24076a.equals(((b6z) obj).f24076a);
    }

    public final int hashCode() {
        return this.f24076a.hashCode();
    }
}
