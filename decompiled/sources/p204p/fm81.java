package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fm81 {

    /* JADX INFO: renamed from: a */
    public final String f70989a;

    /* JADX INFO: renamed from: b */
    public final String f70990b;

    /* JADX INFO: renamed from: c */
    public final String f70991c;

    public fm81(String str, String str2, String str3) {
        this.f70989a = str;
        this.f70990b = str2;
        this.f70991c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm81)) {
            return false;
        }
        fm81 fm81Var = (fm81) obj;
        return wj50.m88271j(this.f70989a, fm81Var.f70989a) && wj50.m88271j(this.f70990b, fm81Var.f70990b) && wj50.m88271j(this.f70991c, fm81Var.f70991c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f70989a.hashCode() * 31, 31, this.f70990b);
        String str = this.f70991c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
