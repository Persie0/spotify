package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g820 {

    /* JADX INFO: renamed from: a */
    public final cvt f77395a;

    public g820(cvt cvtVar) {
        this.f77395a = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g820) && wj50.m88271j(this.f77395a, ((g820) obj).f77395a);
    }

    public final int hashCode() {
        cvt cvtVar = this.f77395a;
        if (cvtVar == null) {
            return 0;
        }
        return cvtVar.hashCode();
    }
}
