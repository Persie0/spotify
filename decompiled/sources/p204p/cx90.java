package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cx90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f42954a;

    /* JADX INFO: renamed from: b */
    public final boolean f42955b;

    public cx90(String str, boolean z) {
        this.f42954a = str;
        this.f42955b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx90)) {
            return false;
        }
        cx90 cx90Var = (cx90) obj;
        return wj50.m88271j(this.f42954a, cx90Var.f42954a) && this.f42955b == cx90Var.f42955b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42955b) + (this.f42954a.hashCode() * 31);
    }
}
