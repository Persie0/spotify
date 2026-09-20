package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c7p0 {

    /* JADX INFO: renamed from: a */
    public final kfz f34975a;

    public c7p0(kfz kfzVar) {
        this.f34975a = kfzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c7p0) {
            return this.f34975a.equals(((c7p0) obj).f34975a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34975a.f122246a.hashCode();
    }
}
