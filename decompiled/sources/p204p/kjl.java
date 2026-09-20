package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kjl {

    /* JADX INFO: renamed from: a */
    public final int f123376a;

    /* JADX INFO: renamed from: b */
    public final int f123377b;

    /* JADX INFO: renamed from: c */
    public final boolean f123378c;

    public kjl(int i, int i2, boolean z) {
        this.f123376a = i;
        this.f123377b = i2;
        this.f123378c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjl)) {
            return false;
        }
        kjl kjlVar = (kjl) obj;
        return this.f123376a == kjlVar.f123376a && this.f123377b == kjlVar.f123377b && this.f123378c == kjlVar.f123378c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123378c) + f710.m40938f(this.f123377b, edb.m38547C(this.f123376a) * 31, 31);
    }
}
