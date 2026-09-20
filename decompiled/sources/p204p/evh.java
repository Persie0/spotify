package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class evh {

    /* JADX INFO: renamed from: a */
    public final String f63269a;

    /* JADX INFO: renamed from: b */
    public final boolean f63270b;

    public evh(String str, boolean z) {
        this.f63269a = str;
        this.f63270b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evh)) {
            return false;
        }
        evh evhVar = (evh) obj;
        return wj50.m88271j(this.f63269a, evhVar.f63269a) && this.f63270b == evhVar.f63270b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63270b) + (this.f63269a.hashCode() * 31);
    }
}
