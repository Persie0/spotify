package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ye3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f271909a;

    /* JADX INFO: renamed from: b */
    public final String f271910b;

    /* JADX INFO: renamed from: c */
    public final d850 f271911c;

    public ye3(String str, String str2, d850 d850Var) {
        this.f271909a = str;
        this.f271910b = str2;
        this.f271911c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye3)) {
            return false;
        }
        ye3 ye3Var = (ye3) obj;
        return wj50.m88271j(this.f271909a, ye3Var.f271909a) && wj50.m88271j(this.f271910b, ye3Var.f271910b) && wj50.m88271j(this.f271911c, ye3Var.f271911c);
    }

    public final int hashCode() {
        return this.f271911c.hashCode() + s571.m77243b(this.f271909a.hashCode() * 31, 31, this.f271910b);
    }
}
