package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zh40 implements ci40 {

    /* JADX INFO: renamed from: a */
    public final String f282793a;

    /* JADX INFO: renamed from: b */
    public final iv50 f282794b;

    /* JADX INFO: renamed from: c */
    public final String f282795c;

    /* JADX INFO: renamed from: d */
    public final boolean f282796d;

    public zh40(String str, iv50 iv50Var, String str2, boolean z) {
        this.f282793a = str;
        this.f282794b = iv50Var;
        this.f282795c = str2;
        this.f282796d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh40)) {
            return false;
        }
        zh40 zh40Var = (zh40) obj;
        return wj50.m88271j(this.f282793a, zh40Var.f282793a) && wj50.m88271j(this.f282794b, zh40Var.f282794b) && wj50.m88271j(this.f282795c, zh40Var.f282795c) && this.f282796d == zh40Var.f282796d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282796d) + s571.m77243b((this.f282794b.hashCode() + (this.f282793a.hashCode() * 31)) * 31, 31, this.f282795c);
    }
}
