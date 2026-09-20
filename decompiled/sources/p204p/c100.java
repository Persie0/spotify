package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c100 {

    /* JADX INFO: renamed from: a */
    public final String f32924a;

    /* JADX INFO: renamed from: b */
    public final int f32925b;

    /* JADX INFO: renamed from: c */
    public final String f32926c;

    public c100(String str, int i, String str2) {
        this.f32924a = str;
        this.f32925b = i;
        this.f32926c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c100)) {
            return false;
        }
        c100 c100Var = (c100) obj;
        return wj50.m88271j(this.f32924a, c100Var.f32924a) && this.f32925b == c100Var.f32925b && wj50.m88271j(this.f32926c, c100Var.f32926c);
    }

    public final int hashCode() {
        return this.f32926c.hashCode() + mt60.m62800g(this.f32925b, this.f32924a.hashCode() * 31, 31);
    }
}
