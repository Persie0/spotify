package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f259371a;

    /* JADX INFO: renamed from: b */
    public final boolean f259372b;

    public x9i(String str, boolean z) {
        this.f259371a = str;
        this.f259372b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9i)) {
            return false;
        }
        x9i x9iVar = (x9i) obj;
        return wj50.m88271j(this.f259371a, x9iVar.f259371a) && this.f259372b == x9iVar.f259372b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259372b) + (this.f259371a.hashCode() * 31);
    }
}
