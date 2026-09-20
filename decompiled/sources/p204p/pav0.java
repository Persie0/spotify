package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pav0 {

    /* JADX INFO: renamed from: a */
    public final boolean f175634a;

    public pav0(boolean z) {
        this.f175634a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pav0) && this.f175634a == ((pav0) obj).f175634a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175634a);
    }
}
