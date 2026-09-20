package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f203320a;

    /* JADX INFO: renamed from: b */
    public final cc20 f203321b;

    public rwc0(String str, cc20 cc20Var) {
        this.f203320a = str;
        this.f203321b = cc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwc0)) {
            return false;
        }
        rwc0 rwc0Var = (rwc0) obj;
        return wj50.m88271j(this.f203320a, rwc0Var.f203320a) && wj50.m88271j(this.f203321b, rwc0Var.f203321b);
    }

    public final int hashCode() {
        int iHashCode = this.f203320a.hashCode() * 31;
        cc20 cc20Var = this.f203321b;
        return iHashCode + (cc20Var == null ? 0 : cc20Var.hashCode());
    }
}
