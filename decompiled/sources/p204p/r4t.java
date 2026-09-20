package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r4t extends o5t {

    /* JADX INFO: renamed from: a */
    public final boolean f195843a;

    public r4t(boolean z) {
        this.f195843a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4t) && this.f195843a == ((r4t) obj).f195843a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195843a);
    }
}
