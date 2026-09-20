package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i37 implements k37 {

    /* JADX INFO: renamed from: a */
    public final String f98050a;

    /* JADX INFO: renamed from: b */
    public final String f98051b;

    /* JADX INFO: renamed from: c */
    public final String f98052c;

    public i37(String str, String str2, String str3) {
        this.f98050a = str;
        this.f98051b = str2;
        this.f98052c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m49573a() {
        return this.f98051b;
    }

    /* JADX INFO: renamed from: b */
    public final String m49574b() {
        return this.f98050a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i37)) {
            return false;
        }
        i37 i37Var = (i37) obj;
        return wj50.m88271j(this.f98050a, i37Var.f98050a) && wj50.m88271j(this.f98051b, i37Var.f98051b) && wj50.m88271j(this.f98052c, i37Var.f98052c);
    }

    public final int hashCode() {
        return this.f98052c.hashCode() + s571.m77243b(this.f98050a.hashCode() * 31, 31, this.f98051b);
    }
}
