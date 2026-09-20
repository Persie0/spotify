package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n28 {

    /* JADX INFO: renamed from: a */
    public final l861 f149679a;

    public n28(l861 l861Var) {
        this.f149679a = l861Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n28) && this.f149679a.equals(((n28) obj).f149679a);
    }

    public final int hashCode() {
        return this.f149679a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f149679a + "}";
    }
}
