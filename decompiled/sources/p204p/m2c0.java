package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f139313a;

    /* JADX INFO: renamed from: b */
    public final String f139314b;

    public m2c0(String str, String str2) {
        this.f139313a = str;
        this.f139314b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2c0)) {
            return false;
        }
        m2c0 m2c0Var = (m2c0) obj;
        return wj50.m88271j(this.f139313a, m2c0Var.f139313a) && wj50.m88271j(this.f139314b, m2c0Var.f139314b);
    }

    public final int hashCode() {
        return this.f139314b.hashCode() + (this.f139313a.hashCode() * 31);
    }
}
