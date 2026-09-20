package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gsr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f84009a;

    public gsr0(boolean z) {
        this.f84009a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gsr0) && this.f84009a == ((gsr0) obj).f84009a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84009a);
    }
}
