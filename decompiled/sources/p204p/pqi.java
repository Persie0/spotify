package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pqi implements rqi {

    /* JADX INFO: renamed from: a */
    public final j8t0 f180329a;

    public pqi(j8t0 j8t0Var) {
        this.f180329a = j8t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqi) && this.f180329a == ((pqi) obj).f180329a;
    }

    public final int hashCode() {
        return this.f180329a.hashCode();
    }
}
