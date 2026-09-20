package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rff extends sff {

    /* JADX INFO: renamed from: a */
    public final int f198640a;

    /* JADX INFO: renamed from: b */
    public final boolean f198641b;

    public rff(int i, boolean z) {
        this.f198640a = i;
        this.f198641b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff)) {
            return false;
        }
        rff rffVar = (rff) obj;
        return this.f198640a == rffVar.f198640a && this.f198641b == rffVar.f198641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198641b) + (Integer.hashCode(this.f198640a) * 31);
    }
}
