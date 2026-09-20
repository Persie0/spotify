package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hs6 implements is6 {

    /* JADX INFO: renamed from: a */
    public final String f94615a;

    /* JADX INFO: renamed from: b */
    public final String f94616b;

    public hs6(String str, String str2) {
        this.f94615a = str;
        this.f94616b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs6)) {
            return false;
        }
        hs6 hs6Var = (hs6) obj;
        return wj50.m88271j(this.f94615a, hs6Var.f94615a) && wj50.m88271j(this.f94616b, hs6Var.f94616b);
    }

    public final int hashCode() {
        String str = this.f94615a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94616b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
