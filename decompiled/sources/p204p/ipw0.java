package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ipw0 extends upw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f104573a;

    public ipw0(boolean z) {
        this.f104573a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipw0) && this.f104573a == ((ipw0) obj).f104573a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104573a);
    }
}
