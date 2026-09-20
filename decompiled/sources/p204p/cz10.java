package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cz10 {

    /* JADX INFO: renamed from: a */
    public final String f43419a;

    /* JADX INFO: renamed from: b */
    public final boolean f43420b;

    public cz10(String str, boolean z) {
        this.f43419a = str;
        this.f43420b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz10)) {
            return false;
        }
        cz10 cz10Var = (cz10) obj;
        return wj50.m88271j(this.f43419a, cz10Var.f43419a) && this.f43420b == cz10Var.f43420b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43420b) + (this.f43419a.hashCode() * 31);
    }
}
