package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f138849a;

    /* JADX INFO: renamed from: b */
    public final String f138850b;

    /* JADX INFO: renamed from: c */
    public final String f138851c;

    public m161(String str, String str2, String str3) {
        this.f138849a = str;
        this.f138850b = str2;
        this.f138851c = str3;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f138850b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f138849a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m161)) {
            return false;
        }
        m161 m161Var = (m161) obj;
        return wj50.m88271j(this.f138849a, m161Var.f138849a) && wj50.m88271j(this.f138850b, m161Var.f138850b) && wj50.m88271j(this.f138851c, m161Var.f138851c);
    }

    public final int hashCode() {
        return this.f138851c.hashCode() + s571.m77243b(this.f138849a.hashCode() * 31, 31, this.f138850b);
    }
}
