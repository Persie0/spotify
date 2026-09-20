package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ug31 implements vg31 {

    /* JADX INFO: renamed from: a */
    public final String f229975a;

    /* JADX INFO: renamed from: b */
    public final String f229976b;

    public ug31(String str, String str2) {
        this.f229975a = str;
        this.f229976b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug31)) {
            return false;
        }
        ug31 ug31Var = (ug31) obj;
        return wj50.m88271j(this.f229975a, ug31Var.f229975a) && wj50.m88271j(this.f229976b, ug31Var.f229976b);
    }

    public final int hashCode() {
        return this.f229976b.hashCode() + (this.f229975a.hashCode() * 31);
    }
}
