package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lg31 implements zg31 {

    /* JADX INFO: renamed from: a */
    public final String f133064a;

    /* JADX INFO: renamed from: b */
    public final iz50 f133065b;

    public lg31(String str, iz50 iz50Var) {
        this.f133064a = str;
        this.f133065b = iz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg31)) {
            return false;
        }
        lg31 lg31Var = (lg31) obj;
        return wj50.m88271j(this.f133064a, lg31Var.f133064a) && this.f133065b == lg31Var.f133065b;
    }

    public final int hashCode() {
        return this.f133065b.hashCode() + (this.f133064a.hashCode() * 31);
    }
}
