package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ivq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f106266a;

    /* JADX INFO: renamed from: b */
    public final boolean f106267b;

    public ivq0(String str, boolean z) {
        this.f106266a = str;
        this.f106267b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivq0)) {
            return false;
        }
        ivq0 ivq0Var = (ivq0) obj;
        return wj50.m88271j(this.f106266a, ivq0Var.f106266a) && this.f106267b == ivq0Var.f106267b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106267b) + (this.f106266a.hashCode() * 31);
    }
}
