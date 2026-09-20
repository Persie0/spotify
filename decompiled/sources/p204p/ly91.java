package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ly91 implements ny91 {

    /* JADX INFO: renamed from: a */
    public final String f138007a;

    /* JADX INFO: renamed from: b */
    public final er70 f138008b;

    /* JADX INFO: renamed from: c */
    public final boolean f138009c;

    public ly91(String str, er70 er70Var, boolean z) {
        this.f138007a = str;
        this.f138008b = er70Var;
        this.f138009c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly91)) {
            return false;
        }
        ly91 ly91Var = (ly91) obj;
        return wj50.m88271j(this.f138007a, ly91Var.f138007a) && wj50.m88271j(this.f138008b, ly91Var.f138008b) && this.f138009c == ly91Var.f138009c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138009c) + ((this.f138008b.hashCode() + (this.f138007a.hashCode() * 31)) * 31);
    }
}
