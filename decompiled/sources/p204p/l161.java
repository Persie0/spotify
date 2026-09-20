package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class l161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f128641a;

    /* JADX INFO: renamed from: b */
    public final String f128642b;

    /* JADX INFO: renamed from: c */
    public final String f128643c;

    /* JADX INFO: renamed from: d */
    public final String f128644d;

    public l161(String str, String str2, String str3, String str4) {
        this.f128641a = str;
        this.f128642b = str2;
        this.f128643c = str3;
        this.f128644d = str4;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f128642b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f128641a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l161)) {
            return false;
        }
        l161 l161Var = (l161) obj;
        return wj50.m88271j(this.f128641a, l161Var.f128641a) && wj50.m88271j(this.f128642b, l161Var.f128642b) && wj50.m88271j(this.f128643c, l161Var.f128643c) && wj50.m88271j(this.f128644d, l161Var.f128644d);
    }

    public final int hashCode() {
        return this.f128644d.hashCode() + s571.m77243b(s571.m77243b(this.f128641a.hashCode() * 31, 31, this.f128642b), 31, this.f128643c);
    }
}
