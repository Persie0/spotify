package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xqs0 {

    /* JADX INFO: renamed from: a */
    public final String f265107a;

    /* JADX INFO: renamed from: b */
    public final boolean f265108b;

    /* JADX INFO: renamed from: c */
    public final boolean f265109c;

    public xqs0(String str, boolean z, boolean z2) {
        this.f265107a = str;
        this.f265108b = z;
        this.f265109c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqs0)) {
            return false;
        }
        xqs0 xqs0Var = (xqs0) obj;
        return wj50.m88271j(this.f265107a, xqs0Var.f265107a) && this.f265108b == xqs0Var.f265108b && this.f265109c == xqs0Var.f265109c;
    }

    public final int hashCode() {
        String str = this.f265107a;
        return Boolean.hashCode(this.f265109c) + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f265108b);
    }
}
