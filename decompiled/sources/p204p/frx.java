package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class frx implements irx {

    /* JADX INFO: renamed from: a */
    public final boolean f72673a;

    public frx(boolean z) {
        this.f72673a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frx) && this.f72673a == ((frx) obj).f72673a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72673a);
    }
}
