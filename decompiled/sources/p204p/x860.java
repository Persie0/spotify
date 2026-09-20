package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x860 implements c960 {

    /* JADX INFO: renamed from: a */
    public final String f259058a;

    /* JADX INFO: renamed from: b */
    public final oc8 f259059b;

    /* JADX INFO: renamed from: c */
    public final int f259060c;

    public x860(int i, String str, oc8 oc8Var) {
        this.f259058a = str;
        this.f259059b = oc8Var;
        this.f259060c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x860)) {
            return false;
        }
        x860 x860Var = (x860) obj;
        return this.f259058a.equals(x860Var.f259058a) && this.f259059b.equals(x860Var.f259059b) && this.f259060c == x860Var.f259060c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f259060c) + ((this.f259059b.hashCode() + (this.f259058a.hashCode() * 31)) * 31);
    }
}
