package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d7c1 {

    /* JADX INFO: renamed from: a */
    public final String f46065a;

    /* JADX INFO: renamed from: b */
    public final String f46066b;

    /* JADX INFO: renamed from: c */
    public final String f46067c;

    /* JADX INFO: renamed from: d */
    public final String f46068d;

    /* JADX INFO: renamed from: e */
    public final boolean f46069e;

    public d7c1(String str, String str2, String str3, String str4, boolean z) {
        this.f46065a = str;
        this.f46066b = str2;
        this.f46067c = str3;
        this.f46068d = str4;
        this.f46069e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7c1)) {
            return false;
        }
        d7c1 d7c1Var = (d7c1) obj;
        return wj50.m88271j(this.f46065a, d7c1Var.f46065a) && wj50.m88271j(this.f46066b, d7c1Var.f46066b) && wj50.m88271j(this.f46067c, d7c1Var.f46067c) && wj50.m88271j(this.f46068d, d7c1Var.f46068d) && this.f46069e == d7c1Var.f46069e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46069e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f46065a.hashCode() * 31, 31, this.f46066b), 31, this.f46067c), 31, this.f46068d);
    }
}
