package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rwj implements twj {

    /* JADX INFO: renamed from: a */
    public final Exception f203355a;

    public rwj(Exception exc) {
        this.f203355a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwj) && this.f203355a.equals(((rwj) obj).f203355a);
    }

    public final int hashCode() {
        return this.f203355a.hashCode();
    }
}
