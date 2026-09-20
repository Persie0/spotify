package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vjt {

    /* JADX INFO: renamed from: a */
    public final boolean f242055a;

    public vjt(boolean z) {
        this.f242055a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjt) && this.f242055a == ((vjt) obj).f242055a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242055a);
    }
}
