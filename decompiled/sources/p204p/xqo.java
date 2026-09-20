package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xqo {

    /* JADX INFO: renamed from: a */
    public final String f265069a;

    /* JADX INFO: renamed from: b */
    public final String f265070b;

    /* JADX INFO: renamed from: c */
    public final String f265071c;

    public xqo(String str, String str2, String str3) {
        this.f265069a = str;
        this.f265070b = str2;
        this.f265071c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqo)) {
            return false;
        }
        xqo xqoVar = (xqo) obj;
        return wj50.m88271j(this.f265069a, xqoVar.f265069a) && wj50.m88271j(this.f265070b, xqoVar.f265070b) && wj50.m88271j(this.f265071c, xqoVar.f265071c);
    }

    public final int hashCode() {
        return this.f265071c.hashCode() + s571.m77243b(this.f265069a.hashCode() * 31, 31, this.f265070b);
    }
}
