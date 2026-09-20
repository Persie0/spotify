package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class svc {

    /* JADX INFO: renamed from: a */
    public final boolean f214378a;

    /* JADX INFO: renamed from: b */
    public final boolean f214379b;

    public svc(boolean z, boolean z2) {
        this.f214378a = z;
        this.f214379b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svc)) {
            return false;
        }
        svc svcVar = (svc) obj;
        return this.f214378a == svcVar.f214378a && this.f214379b == svcVar.f214379b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f214379b) + (Boolean.hashCode(this.f214378a) * 31);
    }
}
