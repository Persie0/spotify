package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cwl {

    /* JADX INFO: renamed from: a */
    public final boolean f42785a;

    /* JADX INFO: renamed from: b */
    public final int f42786b;

    public cwl(boolean z, int i) {
        this.f42785a = z;
        this.f42786b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwl)) {
            return false;
        }
        cwl cwlVar = (cwl) obj;
        return this.f42785a == cwlVar.f42785a && this.f42786b == cwlVar.f42786b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42786b) + (Boolean.hashCode(this.f42785a) * 31);
    }
}
