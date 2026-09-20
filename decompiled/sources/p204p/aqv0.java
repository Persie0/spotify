package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aqv0 {

    /* JADX INFO: renamed from: a */
    public final String f18846a;

    /* JADX INFO: renamed from: b */
    public final String f18847b;

    /* JADX INFO: renamed from: c */
    public final String f18848c;

    public aqv0(String str, String str2, String str3) {
        this.f18846a = str;
        this.f18847b = str2;
        this.f18848c = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m26901a() {
        return this.f18848c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqv0)) {
            return false;
        }
        aqv0 aqv0Var = (aqv0) obj;
        return wj50.m88271j(this.f18846a, aqv0Var.f18846a) && wj50.m88271j(this.f18847b, aqv0Var.f18847b) && wj50.m88271j(this.f18848c, aqv0Var.f18848c);
    }

    public final int hashCode() {
        return this.f18848c.hashCode() + s571.m77243b(this.f18846a.hashCode() * 31, 31, this.f18847b);
    }
}
