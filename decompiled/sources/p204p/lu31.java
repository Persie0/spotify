package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lu31 implements nu31 {

    /* JADX INFO: renamed from: a */
    public final qcr f136965a;

    public lu31(qcr qcrVar) {
        this.f136965a = qcrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu31) && wj50.m88271j(this.f136965a, ((lu31) obj).f136965a);
    }

    public final int hashCode() {
        qcr qcrVar = this.f136965a;
        if (qcrVar == null) {
            return 0;
        }
        return qcrVar.hashCode();
    }
}
