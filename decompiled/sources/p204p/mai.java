package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mai extends nai {

    /* JADX INFO: renamed from: a */
    public final String f141596a;

    /* JADX INFO: renamed from: b */
    public final d850 f141597b;

    public mai(String str, d850 d850Var) {
        this.f141596a = str;
        this.f141597b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mai)) {
            return false;
        }
        mai maiVar = (mai) obj;
        return wj50.m88271j(this.f141596a, maiVar.f141596a) && wj50.m88271j(this.f141597b, maiVar.f141597b);
    }

    public final int hashCode() {
        return this.f141597b.hashCode() + (this.f141596a.hashCode() * 31);
    }
}
