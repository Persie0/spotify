package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f3s {

    /* JADX INFO: renamed from: a */
    public final boolean f65573a;

    /* JADX INFO: renamed from: b */
    public final boolean f65574b;

    public f3s(boolean z, boolean z2) {
        this.f65573a = z;
        this.f65574b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3s)) {
            return false;
        }
        f3s f3sVar = (f3s) obj;
        return this.f65573a == f3sVar.f65573a && this.f65574b == f3sVar.f65574b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65574b) + (Boolean.hashCode(this.f65573a) * 31);
    }
}
