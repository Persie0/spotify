package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class whp0 implements bip0 {

    /* JADX INFO: renamed from: a */
    public final String f251422a;

    /* JADX INFO: renamed from: b */
    public final String f251423b;

    public whp0(String str, String str2) {
        this.f251422a = str;
        this.f251423b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whp0)) {
            return false;
        }
        whp0 whp0Var = (whp0) obj;
        return wj50.m88271j(this.f251422a, whp0Var.f251422a) && wj50.m88271j(this.f251423b, whp0Var.f251423b);
    }

    public final int hashCode() {
        return this.f251423b.hashCode() + (this.f251422a.hashCode() * 31);
    }
}
