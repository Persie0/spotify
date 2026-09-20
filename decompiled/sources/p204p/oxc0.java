package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final boolean f170959a;

    public oxc0(boolean z) {
        this.f170959a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxc0) && this.f170959a == ((oxc0) obj).f170959a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170959a);
    }
}
