package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iwi extends kwi {

    /* JADX INFO: renamed from: a */
    public final lwi f106458a;

    public iwi(lwi lwiVar) {
        this.f106458a = lwiVar;
    }

    @Override // p204p.kwi
    /* JADX INFO: renamed from: a */
    public final lwi mo51838a() {
        return this.f106458a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwi) && this.f106458a == ((iwi) obj).f106458a;
    }

    public final int hashCode() {
        return this.f106458a.hashCode();
    }
}
