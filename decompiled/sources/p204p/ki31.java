package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ki31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final boolean f122785a;

    public ki31(boolean z) {
        this.f122785a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki31) && this.f122785a == ((ki31) obj).f122785a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122785a);
    }
}
