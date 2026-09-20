package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lez0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132770a;

    public lez0(boolean z) {
        this.f132770a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lez0) && this.f132770a == ((lez0) obj).f132770a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132770a);
    }
}
