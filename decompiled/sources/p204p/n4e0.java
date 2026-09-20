package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n4e0 implements q4e0 {

    /* JADX INFO: renamed from: a */
    public final fwd f150328a;

    public n4e0(fwd fwdVar) {
        this.f150328a = fwdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4e0) && this.f150328a.equals(((n4e0) obj).f150328a);
    }

    public final int hashCode() {
        return this.f150328a.hashCode();
    }
}
