package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f130622a;

    public l7c0(boolean z) {
        this.f130622a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7c0) && this.f130622a == ((l7c0) obj).f130622a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130622a);
    }
}
