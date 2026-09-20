package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n001 implements z001 {

    /* JADX INFO: renamed from: a */
    public final String f148853a;

    /* JADX INFO: renamed from: b */
    public final String f148854b;

    public n001(String str, String str2) {
        this.f148853a = str;
        this.f148854b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n001)) {
            return false;
        }
        n001 n001Var = (n001) obj;
        return wj50.m88271j(this.f148853a, n001Var.f148853a) && wj50.m88271j(this.f148854b, n001Var.f148854b);
    }

    public final int hashCode() {
        String str = this.f148853a;
        return this.f148854b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
