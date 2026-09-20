package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hiv implements miv {

    /* JADX INFO: renamed from: a */
    public final giv f91887a;

    public hiv(giv givVar) {
        this.f91887a = givVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hiv) && wj50.m88271j(this.f91887a, ((hiv) obj).f91887a);
    }

    public final int hashCode() {
        return this.f91887a.hashCode();
    }
}
