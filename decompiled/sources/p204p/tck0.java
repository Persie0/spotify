package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tck0 {

    /* JADX INFO: renamed from: a */
    public final String f219099a;

    /* JADX INFO: renamed from: b */
    public final String f219100b;

    /* JADX INFO: renamed from: c */
    public final String f219101c;

    public tck0(String str, String str2, String str3) {
        this.f219099a = str;
        this.f219100b = str2;
        this.f219101c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tck0)) {
            return false;
        }
        tck0 tck0Var = (tck0) obj;
        return wj50.m88271j(this.f219099a, tck0Var.f219099a) && wj50.m88271j(this.f219100b, tck0Var.f219100b) && wj50.m88271j(this.f219101c, tck0Var.f219101c);
    }

    public final int hashCode() {
        return this.f219101c.hashCode() + s571.m77243b(this.f219099a.hashCode() * 31, 31, this.f219100b);
    }
}
