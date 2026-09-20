package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class juj0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final String f116117c;

    /* JADX INFO: renamed from: d */
    public final boolean f116118d;

    public juj0(String str, boolean z) {
        this.f116117c = str;
        this.f116118d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juj0)) {
            return false;
        }
        juj0 juj0Var = (juj0) obj;
        return wj50.m88271j(this.f116117c, juj0Var.f116117c) && this.f116118d == juj0Var.f116118d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116118d) + (this.f116117c.hashCode() * 31);
    }
}
