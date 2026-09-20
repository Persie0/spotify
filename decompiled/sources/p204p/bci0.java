package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bci0 implements dci0 {

    /* JADX INFO: renamed from: a */
    public final pdu f25895a;

    public bci0(pdu pduVar) {
        this.f25895a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bci0) && wj50.m88271j(this.f25895a, ((bci0) obj).f25895a);
    }

    public final int hashCode() {
        return this.f25895a.hashCode();
    }
}
