package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j6o0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109372a;

    public j6o0(boolean z) {
        this.f109372a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6o0) && this.f109372a == ((j6o0) obj).f109372a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109372a);
    }
}
