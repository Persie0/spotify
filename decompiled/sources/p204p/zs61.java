package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zs61 {

    /* JADX INFO: renamed from: a */
    public final String f285853a;

    /* JADX INFO: renamed from: b */
    public final String f285854b;

    /* JADX INFO: renamed from: c */
    public final String f285855c;

    /* JADX INFO: renamed from: d */
    public final String f285856d;

    public zs61(String str, String str2, String str3, String str4) {
        this.f285853a = str;
        this.f285854b = str2;
        this.f285855c = str3;
        this.f285856d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs61)) {
            return false;
        }
        zs61 zs61Var = (zs61) obj;
        return wj50.m88271j(this.f285853a, zs61Var.f285853a) && wj50.m88271j(this.f285854b, zs61Var.f285854b) && wj50.m88271j(this.f285855c, zs61Var.f285855c) && wj50.m88271j(this.f285856d, zs61Var.f285856d);
    }

    public final int hashCode() {
        return this.f285856d.hashCode() + s571.m77243b(s571.m77243b(this.f285853a.hashCode() * 31, 31, this.f285854b), 31, this.f285855c);
    }
}
