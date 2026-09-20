package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oej0 {

    /* JADX INFO: renamed from: a */
    public final int f164451a;

    /* JADX INFO: renamed from: b */
    public final String f164452b;

    /* JADX INFO: renamed from: c */
    public final String f164453c;

    public oej0(int i, String str, String str2) {
        this.f164451a = i;
        this.f164452b = str;
        this.f164453c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oej0)) {
            return false;
        }
        oej0 oej0Var = (oej0) obj;
        return this.f164451a == oej0Var.f164451a && wj50.m88271j(this.f164452b, oej0Var.f164452b) && wj50.m88271j(this.f164453c, oej0Var.f164453c);
    }

    public final int hashCode() {
        return this.f164453c.hashCode() + s571.m77243b(edb.m38547C(this.f164451a) * 31, 31, this.f164452b);
    }
}
