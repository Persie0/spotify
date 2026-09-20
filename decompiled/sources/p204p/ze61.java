package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ze61 implements af61 {

    /* JADX INFO: renamed from: a */
    public final pdu f281893a;

    public ze61(pdu pduVar) {
        this.f281893a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze61) && wj50.m88271j(this.f281893a, ((ze61) obj).f281893a);
    }

    public final int hashCode() {
        return this.f281893a.hashCode();
    }
}
