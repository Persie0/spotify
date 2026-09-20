package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f186064a;

    public q7b0(boolean z) {
        this.f186064a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7b0) && this.f186064a == ((q7b0) obj).f186064a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186064a);
    }
}
