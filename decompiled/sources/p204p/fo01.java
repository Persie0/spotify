package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fo01 {

    /* JADX INFO: renamed from: a */
    public final String f71390a;

    /* JADX INFO: renamed from: b */
    public final String f71391b;

    /* JADX INFO: renamed from: c */
    public final String f71392c;

    /* JADX INFO: renamed from: d */
    public final String f71393d;

    public fo01(String str, String str2, String str3, String str4) {
        this.f71390a = str;
        this.f71391b = str2;
        this.f71392c = str3;
        this.f71393d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo01)) {
            return false;
        }
        fo01 fo01Var = (fo01) obj;
        return wj50.m88271j(this.f71390a, fo01Var.f71390a) && wj50.m88271j(this.f71391b, fo01Var.f71391b) && wj50.m88271j(this.f71392c, fo01Var.f71392c) && wj50.m88271j(this.f71393d, fo01Var.f71393d);
    }

    public final int hashCode() {
        return this.f71393d.hashCode() + s571.m77243b(s571.m77243b(this.f71390a.hashCode() * 31, 31, this.f71391b), 31, this.f71392c);
    }
}
