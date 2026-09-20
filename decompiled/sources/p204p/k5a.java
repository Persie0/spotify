package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k5a extends l5a {

    /* JADX INFO: renamed from: a */
    public final String f119459a;

    /* JADX INFO: renamed from: b */
    public final String f119460b;

    /* JADX INFO: renamed from: c */
    public final fk11 f119461c;

    public k5a(String str, String str2, fk11 fk11Var) {
        this.f119459a = str;
        this.f119460b = str2;
        this.f119461c = fk11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5a)) {
            return false;
        }
        k5a k5aVar = (k5a) obj;
        return wj50.m88271j(this.f119459a, k5aVar.f119459a) && wj50.m88271j(this.f119460b, k5aVar.f119460b) && wj50.m88271j(this.f119461c, k5aVar.f119461c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f119459a.hashCode() * 31, 31, this.f119460b);
        fk11 fk11Var = this.f119461c;
        return iM77243b + (fk11Var == null ? 0 : fk11Var.hashCode());
    }
}
