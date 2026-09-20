package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a5n0 implements c5n0 {

    /* JADX INFO: renamed from: a */
    public final pdu f12566a;

    public a5n0(pdu pduVar) {
        this.f12566a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5n0) && wj50.m88271j(this.f12566a, ((a5n0) obj).f12566a);
    }

    public final int hashCode() {
        return this.f12566a.hashCode();
    }
}
