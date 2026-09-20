package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cf3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f37243a;

    /* JADX INFO: renamed from: b */
    public final String f37244b;

    /* JADX INFO: renamed from: c */
    public final d850 f37245c;

    public cf3(String str, String str2, d850 d850Var) {
        this.f37243a = str;
        this.f37244b = str2;
        this.f37245c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf3)) {
            return false;
        }
        cf3 cf3Var = (cf3) obj;
        return wj50.m88271j(this.f37243a, cf3Var.f37243a) && wj50.m88271j(this.f37244b, cf3Var.f37244b) && wj50.m88271j(this.f37245c, cf3Var.f37245c);
    }

    public final int hashCode() {
        return this.f37245c.hashCode() + s571.m77243b(this.f37243a.hashCode() * 31, 31, this.f37244b);
    }
}
