package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r8e0 implements s8e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f196782a;

    public r8e0(boolean z) {
        this.f196782a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8e0) && this.f196782a == ((r8e0) obj).f196782a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196782a);
    }
}
