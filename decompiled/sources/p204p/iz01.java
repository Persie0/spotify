package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iz01 extends kz01 {

    /* JADX INFO: renamed from: a */
    public final boolean f107099a;

    public iz01(boolean z) {
        this.f107099a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz01) && this.f107099a == ((iz01) obj).f107099a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107099a);
    }
}
