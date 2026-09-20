package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m751 implements o751 {

    /* JADX INFO: renamed from: a */
    public final pdu f140672a;

    public m751(pdu pduVar) {
        this.f140672a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m751) && wj50.m88271j(this.f140672a, ((m751) obj).f140672a);
    }

    public final int hashCode() {
        return this.f140672a.hashCode();
    }
}
