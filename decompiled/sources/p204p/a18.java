package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a18 {

    /* JADX INFO: renamed from: a */
    public final Object f11351a;

    public a18(Object obj) {
        this.f11351a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a18) {
            return this.f11351a.equals(((a18) obj).f11351a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11351a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return edb.m38568q(new StringBuilder("Identifier{value="), this.f11351a, "}");
    }
}
