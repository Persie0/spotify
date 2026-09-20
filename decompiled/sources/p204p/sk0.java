package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f209962a;

    public sk0(boolean z) {
        this.f209962a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk0) && this.f209962a == ((sk0) obj).f209962a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209962a);
    }
}
