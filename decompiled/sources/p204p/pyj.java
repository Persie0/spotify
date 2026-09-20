package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pyj extends syj {

    /* JADX INFO: renamed from: a */
    public final String f183418a;

    /* JADX INFO: renamed from: b */
    public final int f183419b;

    public pyj(String str, int i) {
        this.f183418a = str;
        this.f183419b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyj)) {
            return false;
        }
        pyj pyjVar = (pyj) obj;
        return wj50.m88271j(this.f183418a, pyjVar.f183418a) && this.f183419b == pyjVar.f183419b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f183419b) + (this.f183418a.hashCode() * 31);
    }
}
