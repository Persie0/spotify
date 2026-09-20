package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final String f216155a;

    /* JADX INFO: renamed from: b */
    public final Float f216156b;

    /* JADX INFO: renamed from: c */
    public final hto0 f216157c;

    public t141(String str, Float f, hto0 hto0Var) {
        this.f216155a = str;
        this.f216156b = f;
        this.f216157c = hto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t141)) {
            return false;
        }
        t141 t141Var = (t141) obj;
        return wj50.m88271j(this.f216155a, t141Var.f216155a) && wj50.m88271j(this.f216156b, t141Var.f216156b) && this.f216157c == t141Var.f216157c;
    }

    public final int hashCode() {
        int iHashCode = this.f216155a.hashCode() * 31;
        Float f = this.f216156b;
        return this.f216157c.hashCode() + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }
}
