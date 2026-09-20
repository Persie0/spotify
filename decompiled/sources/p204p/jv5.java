package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jv5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f116260a;

    /* JADX INFO: renamed from: b */
    public final String f116261b;

    public jv5(String str, String str2) {
        this.f116260a = str;
        this.f116261b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv5)) {
            return false;
        }
        jv5 jv5Var = (jv5) obj;
        return wj50.m88271j(this.f116260a, jv5Var.f116260a) && wj50.m88271j(this.f116261b, jv5Var.f116261b);
    }

    public final int hashCode() {
        int iHashCode = this.f116260a.hashCode() * 31;
        String str = this.f116261b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
