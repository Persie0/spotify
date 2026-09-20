package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x4f implements y4f {

    /* JADX INFO: renamed from: a */
    public final String f258080a;

    /* JADX INFO: renamed from: b */
    public final String f258081b;

    /* JADX INFO: renamed from: c */
    public final String f258082c;

    /* JADX INFO: renamed from: d */
    public final String f258083d;

    public x4f(String str, String str2, String str3, String str4) {
        this.f258080a = str;
        this.f258081b = str2;
        this.f258082c = str3;
        this.f258083d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4f)) {
            return false;
        }
        x4f x4fVar = (x4f) obj;
        return wj50.m88271j(this.f258080a, x4fVar.f258080a) && wj50.m88271j(this.f258081b, x4fVar.f258081b) && wj50.m88271j(this.f258082c, x4fVar.f258082c) && wj50.m88271j(this.f258083d, x4fVar.f258083d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f258080a.hashCode() * 31, 31, this.f258081b);
        String str = this.f258082c;
        return this.f258083d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
