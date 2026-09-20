package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qtd1 {

    /* JADX INFO: renamed from: a */
    public final String f192364a;

    /* JADX INFO: renamed from: b */
    public final String f192365b;

    /* JADX INFO: renamed from: c */
    public final String f192366c;

    public qtd1(String str, String str2, String str3) {
        this.f192364a = str;
        this.f192365b = str2;
        this.f192366c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtd1)) {
            return false;
        }
        qtd1 qtd1Var = (qtd1) obj;
        return wj50.m88271j(this.f192364a, qtd1Var.f192364a) && wj50.m88271j(this.f192365b, qtd1Var.f192365b) && wj50.m88271j(this.f192366c, qtd1Var.f192366c);
    }

    public final int hashCode() {
        return this.f192366c.hashCode() + s571.m77243b(this.f192364a.hashCode() * 31, 31, this.f192365b);
    }
}
