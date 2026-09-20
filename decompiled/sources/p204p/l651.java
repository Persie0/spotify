package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l651 implements rtr {

    /* JADX INFO: renamed from: a */
    public final boolean f130235a;

    public l651(boolean z) {
        this.f130235a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l651) && this.f130235a == ((l651) obj).f130235a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130235a);
    }
}
