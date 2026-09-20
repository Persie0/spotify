package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nvd1 implements pmb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f158870a;

    public nvd1(boolean z) {
        this.f158870a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvd1) && this.f158870a == ((nvd1) obj).f158870a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158870a);
    }
}
