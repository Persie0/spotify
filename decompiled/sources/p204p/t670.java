package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t670 extends v670 {

    /* JADX INFO: renamed from: a */
    public final String f217459a;

    /* JADX INFO: renamed from: b */
    public final String f217460b;

    /* JADX INFO: renamed from: c */
    public final String f217461c;

    public t670(String str, String str2, String str3) {
        this.f217459a = str;
        this.f217460b = str2;
        this.f217461c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t670)) {
            return false;
        }
        t670 t670Var = (t670) obj;
        return wj50.m88271j(this.f217459a, t670Var.f217459a) && wj50.m88271j(this.f217460b, t670Var.f217460b) && wj50.m88271j(this.f217461c, t670Var.f217461c);
    }

    public final int hashCode() {
        return this.f217461c.hashCode() + s571.m77243b(this.f217459a.hashCode() * 31, 31, this.f217460b);
    }
}
