package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl {

    /* JADX INFO: renamed from: a */
    public final String f187706a;

    /* JADX INFO: renamed from: b */
    public final eq31 f187707b;

    public qdl(String str, eq31 eq31Var) {
        this.f187706a = str;
        this.f187707b = eq31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdl)) {
            return false;
        }
        qdl qdlVar = (qdl) obj;
        return wj50.m88271j(this.f187706a, qdlVar.f187706a) && wj50.m88271j(this.f187707b, qdlVar.f187707b);
    }

    public final int hashCode() {
        return this.f187707b.hashCode() + (this.f187706a.hashCode() * 31);
    }
}
