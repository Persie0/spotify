package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v9e0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f238926a;

    public v9e0(boolean z) {
        this.f238926a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9e0) && this.f238926a == ((v9e0) obj).f238926a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238926a);
    }
}
