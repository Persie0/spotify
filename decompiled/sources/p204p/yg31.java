package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class yg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final boolean f272470a;

    public yg31(boolean z) {
        this.f272470a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg31) && this.f272470a == ((yg31) obj).f272470a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272470a);
    }
}
