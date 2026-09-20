package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lsf implements msf {

    /* JADX INFO: renamed from: a */
    public final boolean f136534a;

    public lsf(boolean z) {
        this.f136534a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsf) && this.f136534a == ((lsf) obj).f136534a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136534a);
    }
}
