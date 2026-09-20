package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sy5 {

    /* JADX INFO: renamed from: a */
    public final boolean f215148a;

    /* JADX INFO: renamed from: b */
    public final String f215149b;

    /* JADX INFO: renamed from: c */
    public final String f215150c;

    public sy5(boolean z, String str, String str2) {
        this.f215148a = z;
        this.f215149b = str;
        this.f215150c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy5)) {
            return false;
        }
        sy5 sy5Var = (sy5) obj;
        return this.f215148a == sy5Var.f215148a && this.f215149b.equals(sy5Var.f215149b) && wj50.m88271j(this.f215150c, sy5Var.f215150c);
    }

    public final int hashCode() {
        return this.f215150c.hashCode() + s571.m77243b(Boolean.hashCode(this.f215148a) * 31, 31, this.f215149b);
    }
}
