package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hjo implements kjo {

    /* JADX INFO: renamed from: a */
    public final Object f92208a;

    public hjo(Object obj) {
        this.f92208a = obj;
    }

    public final boolean equals(Object obj) {
        return obj instanceof hjo;
    }

    @Override // p204p.kjo
    public final String getMessage() {
        return "Value for key " + this.f92208a + " is missing, there is probably no active request for it";
    }

    public final int hashCode() {
        return hjo.class.hashCode();
    }

    public final String toString() {
        return "MissingValue(key=" + this.f92208a + ")";
    }
}
