package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vni {

    /* JADX INFO: renamed from: a */
    public final String f243143a;

    /* JADX INFO: renamed from: b */
    public final String f243144b;

    /* JADX INFO: renamed from: c */
    public final String f243145c;

    public vni(String str, String str2, String str3) {
        this.f243143a = str;
        this.f243144b = str2;
        this.f243145c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vni)) {
            return false;
        }
        vni vniVar = (vni) obj;
        return wj50.m88271j(this.f243143a, vniVar.f243143a) && wj50.m88271j(this.f243144b, vniVar.f243144b) && wj50.m88271j(this.f243145c, vniVar.f243145c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f243143a.hashCode() * 31, 31, this.f243144b);
        String str = this.f243145c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
