package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w261 {

    /* JADX INFO: renamed from: a */
    public final String f247244a;

    /* JADX INFO: renamed from: b */
    public final String f247245b;

    /* JADX INFO: renamed from: c */
    public final String f247246c;

    /* JADX INFO: renamed from: d */
    public final String f247247d;

    public w261(String str, String str2, String str3) {
        this.f247244a = str;
        this.f247245b = str2;
        this.f247246c = str3;
        this.f247247d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w261)) {
            return false;
        }
        w261 w261Var = (w261) obj;
        return wj50.m88271j(this.f247244a, w261Var.f247244a) && wj50.m88271j(this.f247245b, w261Var.f247245b) && wj50.m88271j(this.f247246c, w261Var.f247246c) && wj50.m88271j(this.f247247d, w261Var.f247247d);
    }

    public final int hashCode() {
        return this.f247247d.hashCode() + s571.m77243b(s571.m77243b(this.f247244a.hashCode() * 31, 31, this.f247245b), 31, this.f247246c);
    }
}
