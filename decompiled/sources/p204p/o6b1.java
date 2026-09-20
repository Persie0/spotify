package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o6b1 {

    /* JADX INFO: renamed from: f */
    public static final o6b1 f162312f = new o6b1("", "", "", "", false);

    /* JADX INFO: renamed from: a */
    public final String f162313a;

    /* JADX INFO: renamed from: b */
    public final String f162314b;

    /* JADX INFO: renamed from: c */
    public final String f162315c;

    /* JADX INFO: renamed from: d */
    public final String f162316d;

    /* JADX INFO: renamed from: e */
    public final boolean f162317e;

    public o6b1(String str, String str2, String str3, String str4, boolean z) {
        this.f162313a = str;
        this.f162314b = str2;
        this.f162315c = str3;
        this.f162316d = str4;
        this.f162317e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6b1)) {
            return false;
        }
        o6b1 o6b1Var = (o6b1) obj;
        return wj50.m88271j(this.f162313a, o6b1Var.f162313a) && wj50.m88271j(this.f162314b, o6b1Var.f162314b) && wj50.m88271j(this.f162315c, o6b1Var.f162315c) && wj50.m88271j(this.f162316d, o6b1Var.f162316d) && this.f162317e == o6b1Var.f162317e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162317e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f162313a.hashCode() * 31, 31, this.f162314b), 31, this.f162315c), 31, this.f162316d);
    }
}
