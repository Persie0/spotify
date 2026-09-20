package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final boolean f199338a;

    public rhs0(boolean z) {
        this.f199338a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rhs0) && this.f199338a == ((rhs0) obj).f199338a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199338a);
    }
}
