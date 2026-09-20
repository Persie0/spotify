package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f270572a;

    /* JADX INFO: renamed from: b */
    public final pcu0 f270573b;

    public y9d(String str, pcu0 pcu0Var) {
        this.f270572a = str;
        this.f270573b = pcu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9d)) {
            return false;
        }
        y9d y9dVar = (y9d) obj;
        return wj50.m88271j(this.f270572a, y9dVar.f270572a) && wj50.m88271j(this.f270573b, y9dVar.f270573b);
    }

    public final int hashCode() {
        return this.f270573b.hashCode() + (this.f270572a.hashCode() * 31);
    }
}
