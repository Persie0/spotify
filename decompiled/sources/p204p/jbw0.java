package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jbw0 implements pbw0 {

    /* JADX INFO: renamed from: a */
    public final String f110915a;

    /* JADX INFO: renamed from: b */
    public final fgr f110916b;

    public jbw0(String str, fgr fgrVar) {
        this.f110915a = str;
        this.f110916b = fgrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbw0)) {
            return false;
        }
        jbw0 jbw0Var = (jbw0) obj;
        return wj50.m88271j(this.f110915a, jbw0Var.f110915a) && wj50.m88271j(this.f110916b, jbw0Var.f110916b);
    }

    public final int hashCode() {
        return this.f110916b.hashCode() + (this.f110915a.hashCode() * 31);
    }
}
