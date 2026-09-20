package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f107654a;

    /* JADX INFO: renamed from: b */
    public final String f107655b;

    /* JADX INFO: renamed from: c */
    public final String f107656c;

    /* JADX INFO: renamed from: d */
    public final String f107657d;

    public j161(String str, String str2, String str3, String str4) {
        this.f107654a = str;
        this.f107655b = str2;
        this.f107656c = str3;
        this.f107657d = str4;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f107655b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f107654a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j161)) {
            return false;
        }
        j161 j161Var = (j161) obj;
        return wj50.m88271j(this.f107654a, j161Var.f107654a) && wj50.m88271j(this.f107655b, j161Var.f107655b) && wj50.m88271j(this.f107656c, j161Var.f107656c) && wj50.m88271j(this.f107657d, j161Var.f107657d);
    }

    public final int hashCode() {
        return this.f107657d.hashCode() + s571.m77243b(s571.m77243b(this.f107654a.hashCode() * 31, 31, this.f107655b), 31, this.f107656c);
    }
}
