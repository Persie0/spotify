package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u991 {

    /* JADX INFO: renamed from: a */
    public final b791 f228108a;

    /* JADX INFO: renamed from: b */
    public final String f228109b;

    /* JADX INFO: renamed from: c */
    public final boolean f228110c;

    public u991(b791 b791Var, String str, boolean z) {
        this.f228108a = b791Var;
        this.f228109b = str;
        this.f228110c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u991)) {
            return false;
        }
        u991 u991Var = (u991) obj;
        return wj50.m88271j(this.f228108a, u991Var.f228108a) && wj50.m88271j(this.f228109b, u991Var.f228109b) && this.f228110c == u991Var.f228110c;
    }

    public final int hashCode() {
        b791 b791Var = this.f228108a;
        return Boolean.hashCode(this.f228110c) + s571.m77243b((b791Var == null ? 0 : b791Var.hashCode()) * 31, 31, this.f228109b);
    }
}
