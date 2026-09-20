package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d051 {

    /* JADX INFO: renamed from: a */
    public final String f43776a;

    /* JADX INFO: renamed from: b */
    public final String f43777b;

    public d051(String str, String str2) {
        this.f43776a = str;
        this.f43777b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d051)) {
            return false;
        }
        d051 d051Var = (d051) obj;
        return wj50.m88271j(this.f43776a, d051Var.f43776a) && wj50.m88271j(this.f43777b, d051Var.f43777b);
    }

    public final int hashCode() {
        return this.f43777b.hashCode() + (this.f43776a.hashCode() * 31);
    }
}
