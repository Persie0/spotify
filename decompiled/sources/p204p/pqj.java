package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final eyy f180331a;

    public pqj(eyy eyyVar) {
        this.f180331a = eyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqj) && this.f180331a == ((pqj) obj).f180331a;
    }

    public final int hashCode() {
        return this.f180331a.hashCode();
    }
}
