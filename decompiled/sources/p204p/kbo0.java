package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f121238a;

    public kbo0(String str) {
        this.f121238a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbo0) && wj50.m88271j(this.f121238a, ((kbo0) obj).f121238a);
    }

    public final int hashCode() {
        return this.f121238a.hashCode();
    }
}
