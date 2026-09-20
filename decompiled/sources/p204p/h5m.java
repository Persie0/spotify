package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class h5m {

    /* JADX INFO: renamed from: a */
    public final boolean f87867a;

    /* JADX INFO: renamed from: b */
    public final boolean f87868b;

    /* JADX INFO: renamed from: c */
    public final boolean f87869c;

    public h5m(boolean z, boolean z2, boolean z3) {
        this.f87867a = z;
        this.f87868b = z2;
        this.f87869c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5m)) {
            return false;
        }
        h5m h5mVar = (h5m) obj;
        return this.f87867a == h5mVar.f87867a && this.f87868b == h5mVar.f87868b && this.f87869c == h5mVar.f87869c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87869c) + s571.m77245d(Boolean.hashCode(this.f87867a) * 31, 31, this.f87868b);
    }
}
