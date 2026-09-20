package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jt91 {

    /* JADX INFO: renamed from: a */
    public final String f115769a;

    /* JADX INFO: renamed from: b */
    public final String f115770b;

    public jt91(String str, String str2) {
        this.f115769a = str;
        this.f115770b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m54274a() {
        return this.f115770b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt91)) {
            return false;
        }
        jt91 jt91Var = (jt91) obj;
        return wj50.m88271j(this.f115769a, jt91Var.f115769a) && wj50.m88271j(this.f115770b, jt91Var.f115770b);
    }

    public final int hashCode() {
        return this.f115770b.hashCode() + (this.f115769a.hashCode() * 31);
    }
}
