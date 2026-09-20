package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qac1 {

    /* JADX INFO: renamed from: a */
    public final String f186846a;

    /* JADX INFO: renamed from: b */
    public final boolean f186847b;

    public qac1(String str, boolean z) {
        this.f186846a = str;
        this.f186847b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qac1)) {
            return false;
        }
        qac1 qac1Var = (qac1) obj;
        return wj50.m88271j(this.f186846a, qac1Var.f186846a) && this.f186847b == qac1Var.f186847b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186847b) + (this.f186846a.hashCode() * 31);
    }
}
