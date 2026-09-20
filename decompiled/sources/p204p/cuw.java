package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cuw implements o2x {

    /* JADX INFO: renamed from: a */
    public final Throwable f42240a;

    /* JADX INFO: renamed from: b */
    public final boolean f42241b;

    public cuw(Throwable th, boolean z) {
        this.f42240a = th;
        this.f42241b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuw)) {
            return false;
        }
        cuw cuwVar = (cuw) obj;
        return wj50.m88271j(this.f42240a, cuwVar.f42240a) && this.f42241b == cuwVar.f42241b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42241b) + (this.f42240a.hashCode() * 31);
    }
}
