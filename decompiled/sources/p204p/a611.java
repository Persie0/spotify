package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a611 {

    /* JADX INFO: renamed from: a */
    public final String f12670a;

    /* JADX INFO: renamed from: b */
    public final String f12671b;

    /* JADX INFO: renamed from: c */
    public final String f12672c;

    /* JADX INFO: renamed from: d */
    public final String f12673d;

    public a611(String str, String str2, String str3, String str4) {
        this.f12670a = str;
        this.f12671b = str2;
        this.f12672c = str3;
        this.f12673d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a611)) {
            return false;
        }
        a611 a611Var = (a611) obj;
        return wj50.m88271j(this.f12670a, a611Var.f12670a) && wj50.m88271j(this.f12671b, a611Var.f12671b) && wj50.m88271j(this.f12672c, a611Var.f12672c) && wj50.m88271j(this.f12673d, a611Var.f12673d);
    }

    public final int hashCode() {
        return this.f12673d.hashCode() + s571.m77243b(s571.m77243b(this.f12670a.hashCode() * 31, 31, this.f12671b), 31, this.f12672c);
    }
}
