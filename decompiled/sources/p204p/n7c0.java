package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151133a;

    public n7c0(boolean z) {
        this.f151133a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7c0) && this.f151133a == ((n7c0) obj).f151133a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151133a);
    }
}
