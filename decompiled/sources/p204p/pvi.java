package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pvi implements rvi {

    /* JADX INFO: renamed from: a */
    public final fyf f181777a;

    public pvi(fyf fyfVar) {
        this.f181777a = fyfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvi) && this.f181777a.equals(((pvi) obj).f181777a);
    }

    public final int hashCode() {
        return this.f181777a.hashCode();
    }
}
