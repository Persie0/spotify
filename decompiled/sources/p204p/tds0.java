package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tds0 {

    /* JADX INFO: renamed from: a */
    public final String f219473a;

    /* JADX INFO: renamed from: b */
    public final String f219474b;

    /* JADX INFO: renamed from: c */
    public final String f219475c;

    public tds0(String str, String str2, String str3) {
        this.f219473a = str;
        this.f219474b = str2;
        this.f219475c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tds0)) {
            return false;
        }
        tds0 tds0Var = (tds0) obj;
        return wj50.m88271j(this.f219473a, tds0Var.f219473a) && wj50.m88271j(this.f219474b, tds0Var.f219474b) && wj50.m88271j(this.f219475c, tds0Var.f219475c);
    }

    public final int hashCode() {
        return this.f219475c.hashCode() + s571.m77243b(this.f219473a.hashCode() * 31, 31, this.f219474b);
    }
}
