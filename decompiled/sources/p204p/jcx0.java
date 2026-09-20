package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jcx0 {

    /* JADX INFO: renamed from: a */
    public final String f111199a;

    /* JADX INFO: renamed from: b */
    public final boolean f111200b;

    public jcx0(String str, boolean z) {
        this.f111199a = str;
        this.f111200b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcx0)) {
            return false;
        }
        jcx0 jcx0Var = (jcx0) obj;
        return wj50.m88271j(this.f111199a, jcx0Var.f111199a) && this.f111200b == jcx0Var.f111200b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111200b) + (this.f111199a.hashCode() * 31);
    }
}
