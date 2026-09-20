package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x08 extends z0y {

    /* JADX INFO: renamed from: a */
    public final w08 f256826a;

    public x08(w08 w08Var) {
        this.f256826a = w08Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0y)) {
            return false;
        }
        return this.f256826a.equals(((x08) ((z0y) obj)).f256826a);
    }

    public final int hashCode() {
        return this.f256826a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f256826a + "}";
    }
}
