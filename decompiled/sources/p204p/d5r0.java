package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d5r0 {

    /* JADX INFO: renamed from: a */
    public final String f45482a;

    /* JADX INFO: renamed from: b */
    public final String f45483b;

    public d5r0(String str, String str2) {
        this.f45482a = str;
        this.f45483b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5r0)) {
            return false;
        }
        d5r0 d5r0Var = (d5r0) obj;
        return wj50.m88271j(this.f45482a, d5r0Var.f45482a) && wj50.m88271j(this.f45483b, d5r0Var.f45483b);
    }

    public final int hashCode() {
        return this.f45483b.hashCode() + (this.f45482a.hashCode() * 31);
    }
}
