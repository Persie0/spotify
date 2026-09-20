package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class h2c1 extends i2c1 {

    /* JADX INFO: renamed from: a */
    public final int f86951a;

    /* JADX INFO: renamed from: b */
    public final String f86952b;

    public h2c1(int i, String str) {
        this.f86951a = i;
        this.f86952b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2c1)) {
            return false;
        }
        h2c1 h2c1Var = (h2c1) obj;
        return this.f86951a == h2c1Var.f86951a && wj50.m88271j(this.f86952b, h2c1Var.f86952b);
    }

    public final int hashCode() {
        return this.f86952b.hashCode() + (Integer.hashCode(this.f86951a) * 31);
    }
}
