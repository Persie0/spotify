package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rby0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197676a;

    public rby0(boolean z) {
        this.f197676a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rby0) && this.f197676a == ((rby0) obj).f197676a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197676a);
    }
}
