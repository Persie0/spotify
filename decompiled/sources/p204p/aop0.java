package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aop0 {

    /* JADX INFO: renamed from: a */
    public final String f17741a;

    /* JADX INFO: renamed from: b */
    public final String f17742b;

    public aop0(String str, String str2) {
        this.f17741a = str;
        this.f17742b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aop0)) {
            return false;
        }
        aop0 aop0Var = (aop0) obj;
        return wj50.m88271j(this.f17741a, aop0Var.f17741a) && wj50.m88271j(this.f17742b, aop0Var.f17742b);
    }

    public final int hashCode() {
        int iHashCode = this.f17741a.hashCode() * 31;
        String str = this.f17742b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
