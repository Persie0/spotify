package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r261 {

    /* JADX INFO: renamed from: a */
    public final String f195069a;

    /* JADX INFO: renamed from: b */
    public final int f195070b;

    /* JADX INFO: renamed from: c */
    public final String f195071c;

    public r261(String str, int i, String str2) {
        this.f195069a = str;
        this.f195070b = i;
        this.f195071c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r261)) {
            return false;
        }
        r261 r261Var = (r261) obj;
        return wj50.m88271j(this.f195069a, r261Var.f195069a) && this.f195070b == r261Var.f195070b && wj50.m88271j(this.f195071c, r261Var.f195071c);
    }

    public final int hashCode() {
        return this.f195071c.hashCode() + mt60.m62800g(this.f195070b, this.f195069a.hashCode() * 31, 31);
    }
}
