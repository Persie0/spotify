package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xn01 {

    /* JADX INFO: renamed from: a */
    public final boolean f263483a;

    public xn01(boolean z) {
        this.f263483a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn01) && this.f263483a == ((xn01) obj).f263483a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263483a);
    }
}
