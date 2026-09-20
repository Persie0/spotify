package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fdk {

    /* JADX INFO: renamed from: a */
    public final boolean f68516a;

    /* JADX INFO: renamed from: b */
    public final boolean f68517b;

    /* JADX INFO: renamed from: c */
    public final boolean f68518c;

    /* JADX INFO: renamed from: d */
    public final boolean f68519d;

    public fdk(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f68516a = z;
        this.f68517b = z2;
        this.f68518c = z3;
        this.f68519d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdk)) {
            return false;
        }
        fdk fdkVar = (fdk) obj;
        return this.f68516a == fdkVar.f68516a && this.f68517b == fdkVar.f68517b && this.f68518c == fdkVar.f68518c && this.f68519d == fdkVar.f68519d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68519d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f68516a) * 31, 31, this.f68517b), 31, this.f68518c);
    }
}
