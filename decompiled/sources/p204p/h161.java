package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h161 implements p161 {

    /* JADX INFO: renamed from: a */
    public final String f86520a;

    /* JADX INFO: renamed from: b */
    public final String f86521b;

    /* JADX INFO: renamed from: c */
    public final String f86522c;

    public h161(String str, String str2, String str3) {
        this.f86520a = str;
        this.f86521b = str2;
        this.f86522c = str3;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: a */
    public final String mo46408a() {
        return this.f86521b;
    }

    @Override // p204p.p161
    /* JADX INFO: renamed from: b */
    public final String mo46409b() {
        return this.f86520a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h161)) {
            return false;
        }
        h161 h161Var = (h161) obj;
        return wj50.m88271j(this.f86520a, h161Var.f86520a) && wj50.m88271j(this.f86521b, h161Var.f86521b) && wj50.m88271j(this.f86522c, h161Var.f86522c);
    }

    public final int hashCode() {
        return this.f86522c.hashCode() + s571.m77243b(this.f86520a.hashCode() * 31, 31, this.f86521b);
    }
}
