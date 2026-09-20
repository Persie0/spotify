package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eh60 implements gh60 {

    /* JADX INFO: renamed from: a */
    public final String f59506a;

    /* JADX INFO: renamed from: b */
    public final String f59507b;

    public eh60(String str, String str2) {
        this.f59506a = str;
        this.f59507b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh60)) {
            return false;
        }
        eh60 eh60Var = (eh60) obj;
        return wj50.m88271j(this.f59506a, eh60Var.f59506a) && wj50.m88271j(this.f59507b, eh60Var.f59507b);
    }

    public final int hashCode() {
        return this.f59507b.hashCode() + (this.f59506a.hashCode() * 31);
    }
}
