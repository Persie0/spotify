package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class k1k {

    /* JADX INFO: renamed from: a */
    public final boolean f118367a;

    /* JADX INFO: renamed from: b */
    public final boolean f118368b;

    /* JADX INFO: renamed from: c */
    public final boolean f118369c;

    public k1k(boolean z, boolean z2, boolean z3) {
        this.f118367a = z;
        this.f118368b = z2;
        this.f118369c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1k)) {
            return false;
        }
        k1k k1kVar = (k1k) obj;
        return this.f118367a == k1kVar.f118367a && this.f118368b == k1kVar.f118368b && this.f118369c == k1kVar.f118369c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118369c) + s571.m77245d(Boolean.hashCode(this.f118367a) * 31, 31, this.f118368b);
    }
}
