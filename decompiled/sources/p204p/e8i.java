package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final String f57208a;

    /* JADX INFO: renamed from: b */
    public final String f57209b;

    /* JADX INFO: renamed from: c */
    public final String f57210c;

    /* JADX INFO: renamed from: d */
    public final int f57211d;

    public e8i(String str, String str2, int i, String str3) {
        this.f57208a = str;
        this.f57209b = str2;
        this.f57210c = str3;
        this.f57211d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8i)) {
            return false;
        }
        e8i e8iVar = (e8i) obj;
        return wj50.m88271j(this.f57208a, e8iVar.f57208a) && wj50.m88271j(this.f57209b, e8iVar.f57209b) && wj50.m88271j(this.f57210c, e8iVar.f57210c) && this.f57211d == e8iVar.f57211d;
    }

    public final int hashCode() {
        int iHashCode = this.f57208a.hashCode() * 31;
        String str = this.f57209b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57210c;
        return Integer.hashCode(this.f57211d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
