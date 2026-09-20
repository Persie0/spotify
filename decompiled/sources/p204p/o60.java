package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o60 implements p60 {

    /* JADX INFO: renamed from: a */
    public final pdu f162181a;

    public o60(pdu pduVar) {
        this.f162181a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o60) && wj50.m88271j(this.f162181a, ((o60) obj).f162181a);
    }

    public final int hashCode() {
        return this.f162181a.hashCode();
    }
}
