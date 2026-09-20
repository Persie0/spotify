package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class my91 implements ny91 {

    /* JADX INFO: renamed from: a */
    public final String f148370a;

    /* JADX INFO: renamed from: b */
    public final er70 f148371b;

    /* JADX INFO: renamed from: c */
    public final boolean f148372c;

    public my91(String str, er70 er70Var, boolean z) {
        this.f148370a = str;
        this.f148371b = er70Var;
        this.f148372c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my91)) {
            return false;
        }
        my91 my91Var = (my91) obj;
        return wj50.m88271j(this.f148370a, my91Var.f148370a) && wj50.m88271j(this.f148371b, my91Var.f148371b) && this.f148372c == my91Var.f148372c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148372c) + ((this.f148371b.hashCode() + (this.f148370a.hashCode() * 31)) * 31);
    }
}
