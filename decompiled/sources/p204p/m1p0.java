package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m1p0 extends r1p0 {

    /* JADX INFO: renamed from: a */
    public final String f139044a;

    /* JADX INFO: renamed from: b */
    public final String f139045b;

    public m1p0(String str, String str2) {
        this.f139044a = str;
        this.f139045b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1p0)) {
            return false;
        }
        m1p0 m1p0Var = (m1p0) obj;
        return wj50.m88271j(this.f139044a, m1p0Var.f139044a) && wj50.m88271j(this.f139045b, m1p0Var.f139045b);
    }

    public final int hashCode() {
        return this.f139045b.hashCode() + (this.f139044a.hashCode() * 31);
    }
}
