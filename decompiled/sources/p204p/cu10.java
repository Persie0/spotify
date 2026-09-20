package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cu10 {

    /* JADX INFO: renamed from: a */
    public final String f42014a;

    /* JADX INFO: renamed from: b */
    public final String f42015b;

    public cu10(String str, String str2) {
        this.f42014a = str;
        this.f42015b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu10)) {
            return false;
        }
        cu10 cu10Var = (cu10) obj;
        return wj50.m88271j(this.f42014a, cu10Var.f42014a) && wj50.m88271j(this.f42015b, cu10Var.f42015b);
    }

    public final int hashCode() {
        return this.f42015b.hashCode() + (this.f42014a.hashCode() * 31);
    }
}
