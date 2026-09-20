package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yp5 {

    /* JADX INFO: renamed from: a */
    public final String f274822a;

    /* JADX INFO: renamed from: b */
    public final String f274823b;

    /* JADX INFO: renamed from: c */
    public final String f274824c;

    public yp5(String str, String str2, String str3) {
        this.f274822a = str;
        this.f274823b = str2;
        this.f274824c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m94297a() {
        return this.f274822a;
    }

    /* JADX INFO: renamed from: b */
    public final String m94298b() {
        return this.f274823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp5)) {
            return false;
        }
        yp5 yp5Var = (yp5) obj;
        return wj50.m88271j(this.f274822a, yp5Var.f274822a) && wj50.m88271j(this.f274823b, yp5Var.f274823b) && wj50.m88271j(this.f274824c, yp5Var.f274824c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f274822a.hashCode() * 31, 31, this.f274823b);
        String str = this.f274824c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
