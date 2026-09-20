package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ell0 {

    /* JADX INFO: renamed from: a */
    public final String f60733a;

    /* JADX INFO: renamed from: b */
    public final String f60734b;

    public ell0(String str, String str2) {
        this.f60733a = str;
        this.f60734b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ell0)) {
            return false;
        }
        ell0 ell0Var = (ell0) obj;
        return wj50.m88271j(this.f60733a, ell0Var.f60733a) && wj50.m88271j(this.f60734b, ell0Var.f60734b);
    }

    public final int hashCode() {
        return this.f60734b.hashCode() + (this.f60733a.hashCode() * 31);
    }
}
