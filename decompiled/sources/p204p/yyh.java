package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yyh {

    /* JADX INFO: renamed from: a */
    public final String f277510a;

    /* JADX INFO: renamed from: b */
    public final String f277511b;

    public yyh(String str, String str2) {
        this.f277510a = str;
        this.f277511b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyh)) {
            return false;
        }
        yyh yyhVar = (yyh) obj;
        return wj50.m88271j(this.f277510a, yyhVar.f277510a) && wj50.m88271j(this.f277511b, yyhVar.f277511b);
    }

    public final int hashCode() {
        return this.f277511b.hashCode() + (this.f277510a.hashCode() * 31);
    }
}
