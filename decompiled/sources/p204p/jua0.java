package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jua0 {

    /* JADX INFO: renamed from: a */
    public final String f116063a;

    /* JADX INFO: renamed from: b */
    public final ig7 f116064b;

    public jua0(String str, ig7 ig7Var) {
        this.f116063a = str;
        this.f116064b = ig7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jua0)) {
            return false;
        }
        jua0 jua0Var = (jua0) obj;
        return wj50.m88271j(this.f116063a, jua0Var.f116063a) && wj50.m88271j(this.f116064b, jua0Var.f116064b);
    }

    public final int hashCode() {
        return this.f116064b.hashCode() + (this.f116063a.hashCode() * 31);
    }
}
