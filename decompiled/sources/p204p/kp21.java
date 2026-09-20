package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kp21 {

    /* JADX INFO: renamed from: a */
    public final String f124963a;

    /* JADX INFO: renamed from: b */
    public final boolean f124964b;

    public kp21(String str, boolean z) {
        this.f124963a = str;
        this.f124964b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp21)) {
            return false;
        }
        kp21 kp21Var = (kp21) obj;
        return wj50.m88271j(this.f124963a, kp21Var.f124963a) && this.f124964b == kp21Var.f124964b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124964b) + (this.f124963a.hashCode() * 31);
    }
}
