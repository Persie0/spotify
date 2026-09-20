package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qs5 {

    /* JADX INFO: renamed from: a */
    public final String f191989a;

    /* JADX INFO: renamed from: b */
    public final String f191990b;

    /* JADX INFO: renamed from: c */
    public final String f191991c;

    /* JADX INFO: renamed from: d */
    public final h2i f191992d;

    /* JADX INFO: renamed from: e */
    public final String f191993e;

    /* JADX INFO: renamed from: f */
    public final String f191994f;

    public qs5(String str, String str2, String str3, String str4, String str5, h2i h2iVar) {
        this.f191989a = str;
        this.f191990b = str2;
        this.f191991c = str3;
        this.f191992d = h2iVar;
        this.f191993e = str4;
        this.f191994f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs5)) {
            return false;
        }
        qs5 qs5Var = (qs5) obj;
        return wj50.m88271j(this.f191989a, qs5Var.f191989a) && wj50.m88271j(this.f191990b, qs5Var.f191990b) && wj50.m88271j(this.f191991c, qs5Var.f191991c) && wj50.m88271j(this.f191992d, qs5Var.f191992d) && wj50.m88271j(this.f191993e, qs5Var.f191993e) && wj50.m88271j(this.f191994f, qs5Var.f191994f);
    }

    public final int hashCode() {
        return this.f191994f.hashCode() + s571.m77243b((this.f191992d.hashCode() + s571.m77243b(s571.m77243b(this.f191989a.hashCode() * 31, 31, this.f191990b), 31, this.f191991c)) * 31, 31, this.f191993e);
    }
}
