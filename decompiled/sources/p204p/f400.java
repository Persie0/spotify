package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f400 {

    /* JADX INFO: renamed from: a */
    public final String f65619a;

    /* JADX INFO: renamed from: b */
    public final String f65620b;

    public f400(String str, String str2) {
        this.f65619a = str;
        this.f65620b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f400)) {
            return false;
        }
        f400 f400Var = (f400) obj;
        return wj50.m88271j(this.f65619a, f400Var.f65619a) && wj50.m88271j(this.f65620b, f400Var.f65620b);
    }

    public final int hashCode() {
        return this.f65620b.hashCode() + (this.f65619a.hashCode() * 31);
    }
}
