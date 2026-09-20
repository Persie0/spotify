package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class edr implements hdr {

    /* JADX INFO: renamed from: a */
    public final ddr f58563a;

    /* JADX INFO: renamed from: b */
    public final qcr f58564b;

    /* JADX INFO: renamed from: c */
    public final cdr f58565c;

    public edr(ddr ddrVar, qcr qcrVar, cdr cdrVar) {
        this.f58563a = ddrVar;
        this.f58564b = qcrVar;
        this.f58565c = cdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edr)) {
            return false;
        }
        edr edrVar = (edr) obj;
        return this.f58563a == edrVar.f58563a && wj50.m88271j(this.f58564b, edrVar.f58564b) && wj50.m88271j(this.f58565c, edrVar.f58565c);
    }

    public final int hashCode() {
        return this.f58565c.hashCode() + ((this.f58564b.hashCode() + (this.f58563a.hashCode() * 31)) * 31);
    }
}
