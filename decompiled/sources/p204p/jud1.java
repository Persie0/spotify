package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jud1 {

    /* JADX INFO: renamed from: a */
    public final String f116101a;

    /* JADX INFO: renamed from: b */
    public final boolean f116102b;

    public jud1(String str, boolean z) {
        this.f116101a = str;
        this.f116102b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jud1)) {
            return false;
        }
        jud1 jud1Var = (jud1) obj;
        return wj50.m88271j(this.f116101a, jud1Var.f116101a) && this.f116102b == jud1Var.f116102b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116102b) + (this.f116101a.hashCode() * 31);
    }
}
