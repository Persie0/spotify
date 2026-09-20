package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yni0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274462a;

    public yni0(boolean z) {
        this.f274462a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yni0) && this.f274462a == ((yni0) obj).f274462a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274462a);
    }
}
