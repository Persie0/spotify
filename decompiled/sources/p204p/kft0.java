package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kft0 {

    /* JADX INFO: renamed from: a */
    public final String f122225a;

    /* JADX INFO: renamed from: b */
    public final String f122226b;

    /* JADX INFO: renamed from: c */
    public final String f122227c;

    /* JADX INFO: renamed from: d */
    public final String f122228d;

    public kft0(String str, String str2, String str3, String str4) {
        this.f122225a = str;
        this.f122226b = str2;
        this.f122227c = str3;
        this.f122228d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kft0)) {
            return false;
        }
        kft0 kft0Var = (kft0) obj;
        return wj50.m88271j(this.f122225a, kft0Var.f122225a) && wj50.m88271j(this.f122226b, kft0Var.f122226b) && wj50.m88271j(this.f122227c, kft0Var.f122227c) && wj50.m88271j(this.f122228d, kft0Var.f122228d);
    }

    public final int hashCode() {
        return this.f122228d.hashCode() + s571.m77243b(s571.m77243b(this.f122225a.hashCode() * 31, 31, this.f122226b), 31, this.f122227c);
    }
}
