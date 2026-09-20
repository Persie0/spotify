package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class loc {

    /* JADX INFO: renamed from: a */
    public final String f135379a;

    /* JADX INFO: renamed from: b */
    public final String f135380b;

    /* JADX INFO: renamed from: c */
    public final String f135381c;

    /* JADX INFO: renamed from: d */
    public final String f135382d;

    public loc(String str, String str2, String str3, String str4) {
        this.f135379a = str;
        this.f135380b = str2;
        this.f135381c = str3;
        this.f135382d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loc)) {
            return false;
        }
        loc locVar = (loc) obj;
        return wj50.m88271j(this.f135379a, locVar.f135379a) && wj50.m88271j(this.f135380b, locVar.f135380b) && wj50.m88271j(this.f135381c, locVar.f135381c) && wj50.m88271j(this.f135382d, locVar.f135382d);
    }

    public final int hashCode() {
        return this.f135382d.hashCode() + s571.m77243b(s571.m77243b(this.f135379a.hashCode() * 31, 31, this.f135380b), 31, this.f135381c);
    }
}
