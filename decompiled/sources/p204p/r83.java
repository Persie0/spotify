package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r83 extends t83 {

    /* JADX INFO: renamed from: a */
    public final String f196700a;

    /* JADX INFO: renamed from: b */
    public final String f196701b;

    public r83(String str, String str2) {
        this.f196700a = str;
        this.f196701b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r83)) {
            return false;
        }
        r83 r83Var = (r83) obj;
        return wj50.m88271j(this.f196700a, r83Var.f196700a) && wj50.m88271j(this.f196701b, r83Var.f196701b);
    }

    public final int hashCode() {
        return this.f196701b.hashCode() + (this.f196700a.hashCode() * 31);
    }
}
