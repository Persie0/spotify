package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jg11 {

    /* JADX INFO: renamed from: a */
    public final String f112000a;

    /* JADX INFO: renamed from: b */
    public final boolean f112001b;

    public jg11(String str, boolean z) {
        this.f112000a = str;
        this.f112001b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg11)) {
            return false;
        }
        jg11 jg11Var = (jg11) obj;
        return wj50.m88271j(this.f112000a, jg11Var.f112000a) && this.f112001b == jg11Var.f112001b;
    }

    public final int hashCode() {
        String str = this.f112000a;
        return Boolean.hashCode(this.f112001b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
