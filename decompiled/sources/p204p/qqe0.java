package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qqe0 implements tqe0 {

    /* JADX INFO: renamed from: a */
    public final boolean f191551a;

    public qqe0(boolean z) {
        this.f191551a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqe0) && this.f191551a == ((qqe0) obj).f191551a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191551a);
    }
}
