package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v5z0 extends j6z0 {

    /* JADX INFO: renamed from: a */
    public final String f237686a;

    /* JADX INFO: renamed from: b */
    public final String f237687b;

    /* JADX INFO: renamed from: c */
    public final String f237688c;

    /* JADX INFO: renamed from: d */
    public final String f237689d;

    public v5z0(String str, String str2, String str3, String str4) {
        this.f237686a = str;
        this.f237687b = str2;
        this.f237688c = str3;
        this.f237689d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5z0)) {
            return false;
        }
        v5z0 v5z0Var = (v5z0) obj;
        return wj50.m88271j(this.f237686a, v5z0Var.f237686a) && wj50.m88271j(this.f237687b, v5z0Var.f237687b) && wj50.m88271j(this.f237688c, v5z0Var.f237688c) && wj50.m88271j(this.f237689d, v5z0Var.f237689d);
    }

    public final int hashCode() {
        return this.f237689d.hashCode() + s571.m77243b(s571.m77243b(this.f237686a.hashCode() * 31, 31, this.f237687b), 31, this.f237688c);
    }
}
