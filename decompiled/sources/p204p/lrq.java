package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lrq {

    /* JADX INFO: renamed from: a */
    public final String f136350a;

    /* JADX INFO: renamed from: b */
    public final Object f136351b;

    public lrq(String str, Object obj) {
        this.f136350a = str;
        this.f136351b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrq)) {
            return false;
        }
        lrq lrqVar = (lrq) obj;
        return wj50.m88271j(this.f136350a, lrqVar.f136350a) && wj50.m88271j(this.f136351b, lrqVar.f136351b);
    }

    public final int hashCode() {
        int iHashCode = this.f136350a.hashCode() * 31;
        Object obj = this.f136351b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
