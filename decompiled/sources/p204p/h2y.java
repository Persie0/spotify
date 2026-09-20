package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h2y {

    /* JADX INFO: renamed from: a */
    public final boolean f87089a;

    /* JADX INFO: renamed from: b */
    public final boolean f87090b;

    /* JADX INFO: renamed from: c */
    public final boolean f87091c;

    public h2y(boolean z, boolean z2, boolean z3) {
        this.f87089a = z;
        this.f87090b = z2;
        this.f87091c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2y)) {
            return false;
        }
        h2y h2yVar = (h2y) obj;
        return this.f87089a == h2yVar.f87089a && this.f87090b == h2yVar.f87090b && this.f87091c == h2yVar.f87091c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87091c) + s571.m77245d(Boolean.hashCode(this.f87089a) * 31, 31, this.f87090b);
    }
}
