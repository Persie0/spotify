package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v6w0 {

    /* JADX INFO: renamed from: a */
    public final String f237979a;

    /* JADX INFO: renamed from: b */
    public final String f237980b;

    /* JADX INFO: renamed from: c */
    public final Integer f237981c;

    /* JADX INFO: renamed from: d */
    public final String f237982d;

    /* JADX INFO: renamed from: e */
    public final ern0 f237983e;

    /* JADX INFO: renamed from: f */
    public final u6w0 f237984f;

    public v6w0(String str, String str2, Integer num, String str3, ern0 ern0Var, u6w0 u6w0Var, int i) {
        num = (i & 4) != 0 ? null : num;
        str3 = (i & 8) != 0 ? null : str3;
        ern0Var = (i & 16) != 0 ? opo.m67568r() : ern0Var;
        u6w0Var = (i & 32) != 0 ? null : u6w0Var;
        this.f237979a = str;
        this.f237980b = str2;
        this.f237981c = num;
        this.f237982d = str3;
        this.f237983e = ern0Var;
        this.f237984f = u6w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6w0)) {
            return false;
        }
        v6w0 v6w0Var = (v6w0) obj;
        return wj50.m88271j(this.f237979a, v6w0Var.f237979a) && wj50.m88271j(this.f237980b, v6w0Var.f237980b) && wj50.m88271j(this.f237981c, v6w0Var.f237981c) && wj50.m88271j(this.f237982d, v6w0Var.f237982d) && wj50.m88271j(this.f237983e, v6w0Var.f237983e) && wj50.m88271j(this.f237984f, v6w0Var.f237984f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f237979a.hashCode() * 31, 31, this.f237980b);
        Integer num = this.f237981c;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f237982d;
        int iHashCode2 = (this.f237983e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u6w0 u6w0Var = this.f237984f;
        return iHashCode2 + (u6w0Var != null ? u6w0Var.hashCode() : 0);
    }
}
