package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b70 implements e70 {

    /* JADX INFO: renamed from: a */
    public final String f24106a;

    /* JADX INFO: renamed from: b */
    public final String f24107b;

    /* JADX INFO: renamed from: c */
    public final Long f24108c;

    public b70(Long l, String str, String str2) {
        this.f24106a = str;
        this.f24107b = str2;
        this.f24108c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        return wj50.m88271j(this.f24106a, b70Var.f24106a) && wj50.m88271j(this.f24107b, b70Var.f24107b) && wj50.m88271j(this.f24108c, b70Var.f24108c);
    }

    public final int hashCode() {
        int iHashCode = this.f24106a.hashCode() * 31;
        String str = this.f24107b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f24108c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public /* synthetic */ b70(String str, String str2) {
        this(null, str, str2);
    }
}
