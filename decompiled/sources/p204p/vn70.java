package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vn70 {

    /* JADX INFO: renamed from: a */
    public final String f243015a;

    /* JADX INFO: renamed from: b */
    public final String f243016b;

    /* JADX INFO: renamed from: c */
    public final String f243017c;

    public vn70(String str, String str2, String str3) {
        this.f243015a = str;
        this.f243016b = str2;
        this.f243017c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn70)) {
            return false;
        }
        vn70 vn70Var = (vn70) obj;
        return wj50.m88271j(this.f243015a, vn70Var.f243015a) && wj50.m88271j(this.f243016b, vn70Var.f243016b) && wj50.m88271j(this.f243017c, vn70Var.f243017c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f243015a.hashCode() * 31, 31, this.f243016b);
        String str = this.f243017c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
