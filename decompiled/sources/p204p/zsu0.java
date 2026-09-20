package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zsu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f286001a;

    /* JADX INFO: renamed from: b */
    public final String f286002b;

    public zsu0(boolean z, String str) {
        this.f286001a = z;
        this.f286002b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsu0)) {
            return false;
        }
        zsu0 zsu0Var = (zsu0) obj;
        return this.f286001a == zsu0Var.f286001a && wj50.m88271j(this.f286002b, zsu0Var.f286002b);
    }

    public final int hashCode() {
        return this.f286002b.hashCode() + (Boolean.hashCode(this.f286001a) * 31);
    }
}
