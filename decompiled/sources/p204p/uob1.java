package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uob1 extends wob1 {

    /* JADX INFO: renamed from: a */
    public final int f232372a;

    /* JADX INFO: renamed from: b */
    public final String f232373b;

    /* JADX INFO: renamed from: c */
    public final String f232374c;

    public uob1(int i, String str, String str2) {
        this.f232372a = i;
        this.f232373b = str;
        this.f232374c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uob1)) {
            return false;
        }
        uob1 uob1Var = (uob1) obj;
        return this.f232372a == uob1Var.f232372a && wj50.m88271j(this.f232373b, uob1Var.f232373b) && wj50.m88271j(this.f232374c, uob1Var.f232374c);
    }

    public final int hashCode() {
        return this.f232374c.hashCode() + s571.m77243b(Integer.hashCode(this.f232372a) * 31, 31, this.f232373b);
    }
}
