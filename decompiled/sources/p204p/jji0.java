package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jji0 implements kji0 {

    /* JADX INFO: renamed from: a */
    public final String f113045a;

    /* JADX INFO: renamed from: b */
    public final String f113046b;

    public jji0(String str, String str2) {
        this.f113045a = str;
        this.f113046b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jji0)) {
            return false;
        }
        jji0 jji0Var = (jji0) obj;
        return wj50.m88271j(this.f113045a, jji0Var.f113045a) && wj50.m88271j(this.f113046b, jji0Var.f113046b);
    }

    public final int hashCode() {
        return this.f113046b.hashCode() + (this.f113045a.hashCode() * 31);
    }
}
