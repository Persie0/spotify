package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w890 implements y890 {

    /* JADX INFO: renamed from: a */
    public final pdu f248887a;

    public w890(pdu pduVar) {
        this.f248887a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w890) && wj50.m88271j(this.f248887a, ((w890) obj).f248887a);
    }

    public final int hashCode() {
        return this.f248887a.hashCode();
    }
}
