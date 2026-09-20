package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uae {

    /* JADX INFO: renamed from: a */
    public final boolean f228479a;

    /* JADX INFO: renamed from: b */
    public final qae f228480b;

    /* JADX INFO: renamed from: c */
    public final tae f228481c;

    /* JADX INFO: renamed from: d */
    public final sae f228482d;

    public uae(qae qaeVar, tae taeVar, sae saeVar, int i) {
        boolean z = (i & 1) == 0;
        qaeVar = (i & 2) != 0 ? null : qaeVar;
        taeVar = (i & 4) != 0 ? null : taeVar;
        saeVar = (i & 8) != 0 ? null : saeVar;
        this.f228479a = z;
        this.f228480b = qaeVar;
        this.f228481c = taeVar;
        this.f228482d = saeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uae)) {
            return false;
        }
        uae uaeVar = (uae) obj;
        return this.f228479a == uaeVar.f228479a && wj50.m88271j(this.f228480b, uaeVar.f228480b) && wj50.m88271j(this.f228481c, uaeVar.f228481c) && wj50.m88271j(this.f228482d, uaeVar.f228482d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f228479a) * 31;
        qae qaeVar = this.f228480b;
        int iHashCode2 = (iHashCode + (qaeVar == null ? 0 : qaeVar.hashCode())) * 31;
        tae taeVar = this.f228481c;
        int iHashCode3 = (iHashCode2 + (taeVar == null ? 0 : taeVar.hashCode())) * 31;
        sae saeVar = this.f228482d;
        return iHashCode3 + (saeVar != null ? saeVar.hashCode() : 0);
    }
}
