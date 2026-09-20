package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lou0 {

    /* JADX INFO: renamed from: a */
    public final String f135548a;

    /* JADX INFO: renamed from: b */
    public final String f135549b;

    public lou0(String str, String str2) {
        this.f135548a = str;
        this.f135549b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lou0)) {
            return false;
        }
        lou0 lou0Var = (lou0) obj;
        return wj50.m88271j(this.f135548a, lou0Var.f135548a) && wj50.m88271j(this.f135549b, lou0Var.f135549b);
    }

    public final int hashCode() {
        return this.f135549b.hashCode() + (this.f135548a.hashCode() * 31);
    }
}
