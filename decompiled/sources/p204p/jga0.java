package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jga0 implements kga0 {

    /* JADX INFO: renamed from: a */
    public final String f112131a;

    /* JADX INFO: renamed from: b */
    public final yj70 f112132b;

    public jga0(String str, yj70 yj70Var) {
        this.f112131a = str;
        this.f112132b = yj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jga0)) {
            return false;
        }
        jga0 jga0Var = (jga0) obj;
        return wj50.m88271j(this.f112131a, jga0Var.f112131a) && wj50.m88271j(this.f112132b, jga0Var.f112132b);
    }

    public final int hashCode() {
        return this.f112132b.hashCode() + (this.f112131a.hashCode() * 31);
    }
}
