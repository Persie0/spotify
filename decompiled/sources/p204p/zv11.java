package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zv11 {

    /* JADX INFO: renamed from: a */
    public final xul0 f286586a;

    /* JADX INFO: renamed from: b */
    public final xul0 f286587b;

    /* JADX INFO: renamed from: c */
    public final xul0 f286588c;

    public zv11(xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.f286586a = xul0Var;
        this.f286587b = xul0Var2;
        this.f286588c = xul0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv11)) {
            return false;
        }
        zv11 zv11Var = (zv11) obj;
        return wj50.m88271j(this.f286586a, zv11Var.f286586a) && wj50.m88271j(this.f286587b, zv11Var.f286587b) && wj50.m88271j(this.f286588c, zv11Var.f286588c);
    }

    public final int hashCode() {
        return this.f286588c.hashCode() + ((this.f286587b.hashCode() + (this.f286586a.hashCode() * 31)) * 31);
    }
}
