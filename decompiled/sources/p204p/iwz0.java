package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iwz0 {

    /* JADX INFO: renamed from: a */
    public final g6m f106534a;

    /* JADX INFO: renamed from: b */
    public final g6m f106535b;

    /* JADX INFO: renamed from: c */
    public final ysk f106536c;

    public iwz0(g6m g6mVar, g6m g6mVar2, ysk yskVar) {
        this.f106534a = g6mVar;
        this.f106535b = g6mVar2;
        this.f106536c = yskVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwz0)) {
            return false;
        }
        iwz0 iwz0Var = (iwz0) obj;
        return this.f106534a.equals(iwz0Var.f106534a) && this.f106535b.equals(iwz0Var.f106535b) && this.f106536c.equals(iwz0Var.f106536c);
    }

    public final int hashCode() {
        return this.f106536c.hashCode() + ((this.f106535b.hashCode() + (this.f106534a.hashCode() * 31)) * 31);
    }
}
