package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vit {

    /* JADX INFO: renamed from: a */
    public final String f241786a;

    /* JADX INFO: renamed from: b */
    public final String f241787b;

    /* JADX INFO: renamed from: c */
    public final d850 f241788c;

    public vit(String str, String str2, d850 d850Var) {
        this.f241786a = str;
        this.f241787b = str2;
        this.f241788c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vit)) {
            return false;
        }
        vit vitVar = (vit) obj;
        return wj50.m88271j(this.f241786a, vitVar.f241786a) && wj50.m88271j(this.f241787b, vitVar.f241787b) && wj50.m88271j(this.f241788c, vitVar.f241788c);
    }

    public final int hashCode() {
        return this.f241788c.hashCode() + s571.m77243b(this.f241786a.hashCode() * 31, 31, this.f241787b);
    }
}
