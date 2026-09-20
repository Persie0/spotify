package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e441 {

    /* JADX INFO: renamed from: a */
    public final String f55977a;

    /* JADX INFO: renamed from: b */
    public final String f55978b;

    /* JADX INFO: renamed from: c */
    public final String f55979c;

    /* JADX INFO: renamed from: d */
    public final String f55980d;

    public e441(String str, String str2, String str3, String str4) {
        this.f55977a = str;
        this.f55978b = str2;
        this.f55979c = str3;
        this.f55980d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e441)) {
            return false;
        }
        e441 e441Var = (e441) obj;
        return wj50.m88271j(this.f55977a, e441Var.f55977a) && wj50.m88271j(this.f55978b, e441Var.f55978b) && wj50.m88271j(this.f55979c, e441Var.f55979c) && wj50.m88271j(this.f55980d, e441Var.f55980d);
    }

    public final int hashCode() {
        return this.f55980d.hashCode() + s571.m77243b(s571.m77243b(this.f55977a.hashCode() * 31, 31, this.f55978b), 31, this.f55979c);
    }
}
