package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f118216a;

    /* JADX INFO: renamed from: b */
    public final String f118217b;

    /* JADX INFO: renamed from: c */
    public final String f118218c;

    /* JADX INFO: renamed from: d */
    public final String f118219d;

    public k161(String str, String str2, String str3, String str4) {
        this.f118216a = str;
        this.f118217b = str2;
        this.f118218c = str3;
        this.f118219d = str4;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f118217b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f118216a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k161)) {
            return false;
        }
        k161 k161Var = (k161) obj;
        return wj50.m88271j(this.f118216a, k161Var.f118216a) && wj50.m88271j(this.f118217b, k161Var.f118217b) && wj50.m88271j(this.f118218c, k161Var.f118218c) && wj50.m88271j(this.f118219d, k161Var.f118219d);
    }

    public final int hashCode() {
        return this.f118219d.hashCode() + s571.m77243b(s571.m77243b(this.f118216a.hashCode() * 31, 31, this.f118217b), 31, this.f118218c);
    }
}
