package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jwk0 implements lwk0 {

    /* JADX INFO: renamed from: a */
    public final xaw f116651a;

    public jwk0(xaw xawVar) {
        this.f116651a = xawVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jwk0) && wj50.m88271j(this.f116651a, ((jwk0) obj).f116651a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // p204p.lwk0
    public final String getManifestId() {
        waw wawVar = (waw) g6f.m43745s0(this.f116651a.f259780g);
        if (wawVar != null) {
            return wawVar.f249636a;
        }
        return null;
    }

    @Override // p204p.lwk0
    public final String getUri() {
        return this.f116651a.f259774a.toString();
    }

    public final int hashCode() {
        return this.f116651a.hashCode();
    }
}
