package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class shx0 {

    /* JADX INFO: renamed from: a */
    public final String f209285a;

    /* JADX INFO: renamed from: b */
    public final String f209286b;

    public shx0(String str, String str2) {
        this.f209285a = str;
        this.f209286b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shx0)) {
            return false;
        }
        shx0 shx0Var = (shx0) obj;
        return wj50.m88271j(this.f209285a, shx0Var.f209285a) && wj50.m88271j(this.f209286b, shx0Var.f209286b);
    }

    public final int hashCode() {
        return this.f209286b.hashCode() + (this.f209285a.hashCode() * 31);
    }
}
