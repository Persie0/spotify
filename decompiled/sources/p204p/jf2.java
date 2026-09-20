package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jf2 {

    /* JADX INFO: renamed from: a */
    public final adb1 f111793a;

    /* JADX INFO: renamed from: b */
    public final String f111794b;

    public jf2(adb1 adb1Var, String str) {
        this.f111793a = adb1Var;
        this.f111794b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2)) {
            return false;
        }
        jf2 jf2Var = (jf2) obj;
        return this.f111793a == jf2Var.f111793a && wj50.m88271j(this.f111794b, jf2Var.f111794b);
    }

    public final int hashCode() {
        return this.f111794b.hashCode() + (this.f111793a.hashCode() * 31);
    }
}
