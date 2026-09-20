package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jaz0 {

    /* JADX INFO: renamed from: a */
    public final String f110601a;

    /* JADX INFO: renamed from: b */
    public final String f110602b;

    /* JADX INFO: renamed from: c */
    public final String f110603c;

    public jaz0(String str, String str2, String str3) {
        this.f110601a = str;
        this.f110602b = str2;
        this.f110603c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaz0)) {
            return false;
        }
        jaz0 jaz0Var = (jaz0) obj;
        return wj50.m88271j(this.f110601a, jaz0Var.f110601a) && wj50.m88271j(this.f110602b, jaz0Var.f110602b) && wj50.m88271j(this.f110603c, jaz0Var.f110603c);
    }

    public final int hashCode() {
        return this.f110603c.hashCode() + s571.m77243b(this.f110601a.hashCode() * 31, 31, this.f110602b);
    }
}
