package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yl50 {

    /* JADX INFO: renamed from: a */
    public final String f273911a;

    /* JADX INFO: renamed from: b */
    public final boolean f273912b;

    public yl50(String str, boolean z) {
        this.f273911a = str;
        this.f273912b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl50)) {
            return false;
        }
        yl50 yl50Var = (yl50) obj;
        return wj50.m88271j(this.f273911a, yl50Var.f273911a) && this.f273912b == yl50Var.f273912b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273912b) + (this.f273911a.hashCode() * 31);
    }
}
