package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d7c {

    /* JADX INFO: renamed from: a */
    public final oc81 f46059a;

    /* JADX INFO: renamed from: b */
    public final Object f46060b;

    public d7c(oc81 oc81Var, Object obj) {
        this.f46059a = oc81Var;
        this.f46060b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7c)) {
            return false;
        }
        d7c d7cVar = (d7c) obj;
        return this.f46059a == d7cVar.f46059a && wj50.m88271j(this.f46060b, d7cVar.f46060b);
    }

    public final int hashCode() {
        int iHashCode = this.f46059a.hashCode() * 31;
        Object obj = this.f46060b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
