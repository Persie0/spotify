package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fjz {

    /* JADX INFO: renamed from: a */
    public final Exception f70425a;

    public fjz(Exception exc) {
        this.f70425a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjz) && this.f70425a.equals(((fjz) obj).f70425a);
    }

    public final int hashCode() {
        return this.f70425a.hashCode();
    }
}
