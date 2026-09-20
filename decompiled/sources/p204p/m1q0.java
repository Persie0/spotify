package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m1q0 {

    /* JADX INFO: renamed from: a */
    public final String f139048a;

    /* JADX INFO: renamed from: b */
    public final String f139049b;

    public m1q0(String str, String str2) {
        this.f139048a = str;
        this.f139049b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1q0)) {
            return false;
        }
        m1q0 m1q0Var = (m1q0) obj;
        return wj50.m88271j(this.f139048a, m1q0Var.f139048a) && wj50.m88271j(this.f139049b, m1q0Var.f139049b);
    }

    public final int hashCode() {
        return this.f139049b.hashCode() + (this.f139048a.hashCode() * 31);
    }
}
