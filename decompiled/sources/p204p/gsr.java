package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gsr {

    /* JADX INFO: renamed from: a */
    public final boolean f84007a;

    /* JADX INFO: renamed from: b */
    public final boolean f84008b;

    public gsr(boolean z, boolean z2) {
        this.f84007a = z;
        this.f84008b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsr)) {
            return false;
        }
        gsr gsrVar = (gsr) obj;
        return this.f84007a == gsrVar.f84007a && this.f84008b == gsrVar.f84008b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84008b) + (Boolean.hashCode(this.f84007a) * 31);
    }
}
