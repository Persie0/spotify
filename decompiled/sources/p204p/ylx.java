package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ylx {

    /* JADX INFO: renamed from: a */
    public final boolean f274118a;

    public ylx(boolean z) {
        this.f274118a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ylx) && this.f274118a == ((ylx) obj).f274118a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274118a);
    }
}
