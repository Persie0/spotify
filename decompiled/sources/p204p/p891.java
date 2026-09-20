package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class p891 {

    /* JADX INFO: renamed from: a */
    public final String f174900a;

    /* JADX INFO: renamed from: b */
    public final String f174901b;

    public p891(String str, String str2) {
        this.f174900a = str;
        this.f174901b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p891)) {
            return false;
        }
        p891 p891Var = (p891) obj;
        return wj50.m88271j(this.f174900a, p891Var.f174900a) && wj50.m88271j(this.f174901b, p891Var.f174901b);
    }

    public final int hashCode() {
        return this.f174901b.hashCode() + (this.f174900a.hashCode() * 31);
    }
}
