package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k251 {

    /* JADX INFO: renamed from: a */
    public final String f118494a;

    /* JADX INFO: renamed from: b */
    public final String f118495b;

    /* JADX INFO: renamed from: c */
    public final String f118496c;

    /* JADX INFO: renamed from: d */
    public final String f118497d;

    /* JADX INFO: renamed from: e */
    public final ae50 f118498e;

    /* JADX INFO: renamed from: f */
    public final y351 f118499f;

    /* JADX INFO: renamed from: g */
    public final ae50 f118500g;

    public k251(String str, String str2, String str3, String str4, ae50 ae50Var, y351 y351Var, ae50 ae50Var2) {
        this.f118494a = str;
        this.f118495b = str2;
        this.f118496c = str3;
        this.f118497d = str4;
        this.f118498e = ae50Var;
        this.f118499f = y351Var;
        this.f118500g = ae50Var2;
    }

    /* JADX INFO: renamed from: a */
    public static k251 m55150a(k251 k251Var, w351 w351Var) {
        String str = k251Var.f118494a;
        String str2 = k251Var.f118495b;
        String str3 = k251Var.f118496c;
        String str4 = k251Var.f118497d;
        ae50 ae50Var = k251Var.f118498e;
        ae50 ae50Var2 = k251Var.f118500g;
        k251Var.getClass();
        return new k251(str, str2, str3, str4, ae50Var, w351Var, ae50Var2);
    }

    /* JADX INFO: renamed from: b */
    public final y351 m55151b() {
        return this.f118499f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k251)) {
            return false;
        }
        k251 k251Var = (k251) obj;
        return this.f118494a.equals(k251Var.f118494a) && this.f118495b.equals(k251Var.f118495b) && this.f118496c.equals(k251Var.f118496c) && wj50.m88271j(this.f118497d, k251Var.f118497d) && this.f118498e.equals(k251Var.f118498e) && this.f118499f.equals(k251Var.f118499f) && this.f118500g.equals(k251Var.f118500g);
    }

    public final int hashCode() {
        return this.f118500g.hashCode() + ((this.f118499f.hashCode() + ((this.f118498e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f118494a.hashCode() * 31, 31, this.f118495b), 31, this.f118496c), 31, this.f118497d)) * 31)) * 31);
    }
}
