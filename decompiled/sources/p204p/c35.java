package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c35 implements e35 {

    /* JADX INFO: renamed from: a */
    public final boolean f33554a;

    public c35(boolean z) {
        this.f33554a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c35) && this.f33554a == ((c35) obj).f33554a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33554a);
    }
}
