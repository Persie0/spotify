package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xjr {

    /* JADX INFO: renamed from: a */
    public final boolean f262190a;

    /* JADX INFO: renamed from: b */
    public final String f262191b;

    public xjr(boolean z, String str) {
        this.f262190a = z;
        this.f262191b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjr)) {
            return false;
        }
        xjr xjrVar = (xjr) obj;
        return this.f262190a == xjrVar.f262190a && wj50.m88271j(this.f262191b, xjrVar.f262191b);
    }

    public final int hashCode() {
        return this.f262191b.hashCode() + (Boolean.hashCode(this.f262190a) * 31);
    }
}
