package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zv40 implements aw40 {

    /* JADX INFO: renamed from: a */
    public final String f286606a;

    /* JADX INFO: renamed from: b */
    public final String f286607b;

    public zv40(String str, String str2) {
        this.f286606a = str;
        this.f286607b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv40)) {
            return false;
        }
        zv40 zv40Var = (zv40) obj;
        return wj50.m88271j(this.f286606a, zv40Var.f286606a) && wj50.m88271j(this.f286607b, zv40Var.f286607b);
    }

    public final int hashCode() {
        return this.f286607b.hashCode() + (this.f286606a.hashCode() * 31);
    }
}
