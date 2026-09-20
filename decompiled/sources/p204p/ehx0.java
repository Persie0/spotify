package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ehx0 {

    /* JADX INFO: renamed from: a */
    public final String f59749a;

    /* JADX INFO: renamed from: b */
    public final shx0 f59750b;

    public ehx0(String str, shx0 shx0Var) {
        this.f59749a = str;
        this.f59750b = shx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehx0)) {
            return false;
        }
        ehx0 ehx0Var = (ehx0) obj;
        return wj50.m88271j(this.f59749a, ehx0Var.f59749a) && wj50.m88271j(this.f59750b, ehx0Var.f59750b);
    }

    public final int hashCode() {
        int iHashCode = this.f59749a.hashCode() * 31;
        shx0 shx0Var = this.f59750b;
        return iHashCode + (shx0Var == null ? 0 : shx0Var.hashCode());
    }
}
