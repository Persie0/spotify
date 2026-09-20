package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i8j0 implements j8j0 {

    /* JADX INFO: renamed from: a */
    public final pdu f99798a;

    public i8j0(pdu pduVar) {
        this.f99798a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i8j0) && wj50.m88271j(this.f99798a, ((i8j0) obj).f99798a);
    }

    public final int hashCode() {
        return this.f99798a.hashCode();
    }
}
