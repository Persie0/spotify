package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uwh implements cxh {

    /* JADX INFO: renamed from: a */
    public final boolean f234658a;

    public uwh(boolean z) {
        this.f234658a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwh) && this.f234658a == ((uwh) obj).f234658a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234658a);
    }
}
