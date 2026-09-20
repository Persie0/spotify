package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oji0 implements rji0 {

    /* JADX INFO: renamed from: a */
    public final String f166091a;

    /* JADX INFO: renamed from: b */
    public final String f166092b;

    public oji0(String str, String str2) {
        this.f166091a = str;
        this.f166092b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oji0)) {
            return false;
        }
        oji0 oji0Var = (oji0) obj;
        return wj50.m88271j(this.f166091a, oji0Var.f166091a) && wj50.m88271j(this.f166092b, oji0Var.f166092b);
    }

    public final int hashCode() {
        return this.f166092b.hashCode() + (this.f166091a.hashCode() * 31);
    }
}
