package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class my60 {

    /* JADX INFO: renamed from: a */
    public final qf40 f148327a;

    /* JADX INFO: renamed from: b */
    public final String f148328b;

    /* JADX INFO: renamed from: c */
    public final boolean f148329c;

    /* JADX INFO: renamed from: d */
    public final boolean f148330d;

    public my60(qf40 qf40Var, String str, boolean z, boolean z2) {
        this.f148327a = qf40Var;
        this.f148328b = str;
        this.f148329c = z;
        this.f148330d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my60)) {
            return false;
        }
        my60 my60Var = (my60) obj;
        return wj50.m88271j(this.f148327a, my60Var.f148327a) && wj50.m88271j(this.f148328b, my60Var.f148328b) && this.f148329c == my60Var.f148329c && this.f148330d == my60Var.f148330d;
    }

    public final int hashCode() {
        int iHashCode = this.f148327a.hashCode() * 31;
        String str = this.f148328b;
        return Boolean.hashCode(this.f148330d) + s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f148329c);
    }
}
