package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rj1 {

    /* JADX INFO: renamed from: a */
    public final boolean f199684a;

    public rj1(boolean z) {
        this.f199684a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75635a() {
        return this.f199684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj1) && this.f199684a == ((rj1) obj).f199684a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199684a);
    }
}
