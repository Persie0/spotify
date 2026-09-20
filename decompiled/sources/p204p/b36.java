package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b36 {

    /* JADX INFO: renamed from: a */
    public final String f22908a;

    /* JADX INFO: renamed from: b */
    public final String f22909b;

    /* JADX INFO: renamed from: c */
    public final String f22910c;

    public b36(String str, String str2, String str3) {
        this.f22908a = str;
        this.f22909b = str2;
        this.f22910c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b36)) {
            return false;
        }
        b36 b36Var = (b36) obj;
        return wj50.m88271j(this.f22908a, b36Var.f22908a) && wj50.m88271j(this.f22909b, b36Var.f22909b) && wj50.m88271j(this.f22910c, b36Var.f22910c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f22908a.hashCode() * 31, 31, this.f22909b);
        String str = this.f22910c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
