package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f186070a;

    public q7c0(boolean z) {
        this.f186070a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7c0) && this.f186070a == ((q7c0) obj).f186070a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186070a);
    }
}
