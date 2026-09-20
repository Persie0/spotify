package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class klw0 {

    /* JADX INFO: renamed from: a */
    public final String f123972a;

    /* JADX INFO: renamed from: b */
    public final String f123973b;

    public klw0(String str, String str2) {
        this.f123972a = str;
        this.f123973b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klw0)) {
            return false;
        }
        klw0 klw0Var = (klw0) obj;
        return wj50.m88271j(this.f123972a, klw0Var.f123972a) && wj50.m88271j(this.f123973b, klw0Var.f123973b);
    }

    public final int hashCode() {
        return this.f123973b.hashCode() + (this.f123972a.hashCode() * 31);
    }
}
