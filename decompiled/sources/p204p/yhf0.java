package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yhf0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f272866a;

    /* JADX INFO: renamed from: b */
    public final boolean f272867b;

    /* JADX INFO: renamed from: c */
    public final boolean f272868c;

    public yhf0(Boolean bool, boolean z, boolean z2) {
        this.f272866a = bool;
        this.f272867b = z;
        this.f272868c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhf0)) {
            return false;
        }
        yhf0 yhf0Var = (yhf0) obj;
        return wj50.m88271j(this.f272866a, yhf0Var.f272866a) && this.f272867b == yhf0Var.f272867b && this.f272868c == yhf0Var.f272868c;
    }

    public final int hashCode() {
        Boolean bool = this.f272866a;
        return Boolean.hashCode(this.f272868c) + s571.m77245d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f272867b);
    }
}
