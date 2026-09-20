package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ch6 extends fh6 {

    /* JADX INFO: renamed from: a */
    public final String f37935a;

    /* JADX INFO: renamed from: b */
    public final String f37936b;

    public ch6(String str, String str2) {
        this.f37935a = str;
        this.f37936b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch6)) {
            return false;
        }
        ch6 ch6Var = (ch6) obj;
        return wj50.m88271j(this.f37935a, ch6Var.f37935a) && wj50.m88271j(this.f37936b, ch6Var.f37936b);
    }

    public final int hashCode() {
        return this.f37936b.hashCode() + (this.f37935a.hashCode() * 31);
    }
}
