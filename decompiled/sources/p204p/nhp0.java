package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nhp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f154045a;

    /* JADX INFO: renamed from: b */
    public final String f154046b;

    /* JADX INFO: renamed from: c */
    public final String f154047c;

    /* JADX INFO: renamed from: d */
    public final int f154048d;

    public nhp0(String str, String str2, int i, String str3) {
        this.f154045a = str;
        this.f154046b = str2;
        this.f154047c = str3;
        this.f154048d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhp0)) {
            return false;
        }
        nhp0 nhp0Var = (nhp0) obj;
        return wj50.m88271j(this.f154045a, nhp0Var.f154045a) && wj50.m88271j(this.f154046b, nhp0Var.f154046b) && wj50.m88271j(this.f154047c, nhp0Var.f154047c) && this.f154048d == nhp0Var.f154048d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f154048d) + s571.m77243b(s571.m77243b(this.f154045a.hashCode() * 31, 31, this.f154046b), 31, this.f154047c);
    }
}
