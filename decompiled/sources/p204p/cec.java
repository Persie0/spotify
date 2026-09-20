package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cec {

    /* JADX INFO: renamed from: a */
    public final sdc f37076a;

    public cec(sdc sdcVar) {
        this.f37076a = sdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cec) && wj50.m88271j(this.f37076a, ((cec) obj).f37076a);
    }

    public final int hashCode() {
        sdc sdcVar = this.f37076a;
        if (sdcVar == null) {
            return 0;
        }
        return sdcVar.hashCode();
    }
}
