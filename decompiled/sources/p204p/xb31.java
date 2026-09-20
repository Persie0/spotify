package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xb31 {

    /* JADX INFO: renamed from: a */
    public final String f259832a;

    /* JADX INFO: renamed from: b */
    public final boolean f259833b;

    public xb31(String str, boolean z) {
        this.f259832a = str;
        this.f259833b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb31)) {
            return false;
        }
        xb31 xb31Var = (xb31) obj;
        return wj50.m88271j(this.f259832a, xb31Var.f259832a) && this.f259833b == xb31Var.f259833b;
    }

    public final int hashCode() {
        String str = this.f259832a;
        return Boolean.hashCode(this.f259833b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
