package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t06 {

    /* JADX INFO: renamed from: a */
    public final String f215766a;

    /* JADX INFO: renamed from: b */
    public final String f215767b;

    /* JADX INFO: renamed from: c */
    public final String f215768c;

    public t06(String str, String str2, String str3) {
        this.f215766a = str;
        this.f215767b = str2;
        this.f215768c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t06)) {
            return false;
        }
        t06 t06Var = (t06) obj;
        return wj50.m88271j(this.f215766a, t06Var.f215766a) && wj50.m88271j(this.f215767b, t06Var.f215767b) && wj50.m88271j(this.f215768c, t06Var.f215768c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f215766a.hashCode() * 31, 31, this.f215767b);
        String str = this.f215768c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
