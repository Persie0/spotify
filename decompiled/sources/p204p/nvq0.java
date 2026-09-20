package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f158945a;

    public nvq0(boolean z) {
        this.f158945a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvq0) && this.f158945a == ((nvq0) obj).f158945a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158945a);
    }
}
