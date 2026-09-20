package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jvf0 implements lvf0 {

    /* JADX INFO: renamed from: a */
    public final String f116345a;

    /* JADX INFO: renamed from: b */
    public final String f116346b;

    /* JADX INFO: renamed from: c */
    public final boolean f116347c;

    public jvf0(String str, String str2, boolean z) {
        this.f116345a = str;
        this.f116346b = str2;
        this.f116347c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvf0)) {
            return false;
        }
        jvf0 jvf0Var = (jvf0) obj;
        return wj50.m88271j(this.f116345a, jvf0Var.f116345a) && wj50.m88271j(this.f116346b, jvf0Var.f116346b) && this.f116347c == jvf0Var.f116347c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116347c) + s571.m77243b(this.f116345a.hashCode() * 31, 31, this.f116346b);
    }
}
