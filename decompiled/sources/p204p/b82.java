package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class b82 implements d82 {

    /* JADX INFO: renamed from: a */
    public final pdu f24459a;

    public b82(pdu pduVar) {
        this.f24459a = pduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b82) && wj50.m88271j(this.f24459a, ((b82) obj).f24459a);
    }

    public final int hashCode() {
        return this.f24459a.hashCode();
    }
}
