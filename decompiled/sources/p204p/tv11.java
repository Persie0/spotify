package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tv11 {

    /* JADX INFO: renamed from: a */
    public final int f224027a;

    /* JADX INFO: renamed from: b */
    public final ixb f224028b;

    /* JADX INFO: renamed from: c */
    public final int f224029c;

    public tv11(int i, ixb ixbVar, int i2) {
        this.f224027a = i;
        this.f224028b = ixbVar;
        this.f224029c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv11)) {
            return false;
        }
        tv11 tv11Var = (tv11) obj;
        return this.f224027a == tv11Var.f224027a && wj50.m88271j(this.f224028b, tv11Var.f224028b) && this.f224029c == tv11Var.f224029c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f224029c) + ((this.f224028b.hashCode() + (Integer.hashCode(this.f224027a) * 31)) * 31);
    }
}
