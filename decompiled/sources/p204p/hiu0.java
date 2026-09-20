package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hiu0 implements jiu0 {

    /* JADX INFO: renamed from: a */
    public final String f91884a;

    /* JADX INFO: renamed from: b */
    public final String f91885b;

    /* JADX INFO: renamed from: c */
    public final String f91886c;

    public hiu0(String str, String str2, String str3) {
        this.f91884a = str;
        this.f91885b = str2;
        this.f91886c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiu0)) {
            return false;
        }
        hiu0 hiu0Var = (hiu0) obj;
        return wj50.m88271j(this.f91884a, hiu0Var.f91884a) && wj50.m88271j(this.f91885b, hiu0Var.f91885b) && wj50.m88271j(this.f91886c, hiu0Var.f91886c);
    }

    public final int hashCode() {
        return this.f91886c.hashCode() + s571.m77243b(this.f91884a.hashCode() * 31, 31, this.f91885b);
    }
}
