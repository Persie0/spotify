package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gpx {

    /* JADX INFO: renamed from: a */
    public final mec0 f83262a;

    public gpx(mec0 mec0Var) {
        this.f83262a = mec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpx) && this.f83262a.equals(((gpx) obj).f83262a);
    }

    public final int hashCode() {
        return this.f83262a.hashCode();
    }
}
