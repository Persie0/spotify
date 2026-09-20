package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ec0 {

    /* JADX INFO: renamed from: a */
    public final String f58164a;

    /* JADX INFO: renamed from: b */
    public final String f58165b;

    public ec0(String str, String str2) {
        this.f58164a = str;
        this.f58165b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return wj50.m88271j(this.f58164a, ec0Var.f58164a) && wj50.m88271j(this.f58165b, ec0Var.f58165b);
    }

    public final int hashCode() {
        return this.f58165b.hashCode() + (this.f58164a.hashCode() * 31);
    }
}
