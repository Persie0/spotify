package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yhx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public final String f272987a;

    /* JADX INFO: renamed from: b */
    public final String f272988b;

    public yhx0(String str, String str2) {
        this.f272987a = str;
        this.f272988b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhx0)) {
            return false;
        }
        yhx0 yhx0Var = (yhx0) obj;
        return wj50.m88271j(this.f272987a, yhx0Var.f272987a) && wj50.m88271j(this.f272988b, yhx0Var.f272988b);
    }

    public final int hashCode() {
        return this.f272988b.hashCode() + (this.f272987a.hashCode() * 31);
    }
}
