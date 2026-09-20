package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a5d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f12496a;

    /* JADX INFO: renamed from: b */
    public final String f12497b;

    public a5d1(String str, String str2) {
        this.f12496a = str;
        this.f12497b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5d1)) {
            return false;
        }
        a5d1 a5d1Var = (a5d1) obj;
        return wj50.m88271j(this.f12496a, a5d1Var.f12496a) && wj50.m88271j(this.f12497b, a5d1Var.f12497b);
    }

    public final int hashCode() {
        return this.f12497b.hashCode() + (this.f12496a.hashCode() * 31);
    }
}
