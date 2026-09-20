package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f921 {

    /* JADX INFO: renamed from: a */
    public final String f67158a;

    /* JADX INFO: renamed from: b */
    public final String f67159b;

    public f921(String str, String str2) {
        this.f67158a = str;
        this.f67159b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f921)) {
            return false;
        }
        f921 f921Var = (f921) obj;
        return wj50.m88271j(this.f67158a, f921Var.f67158a) && wj50.m88271j(this.f67159b, f921Var.f67159b);
    }

    public final int hashCode() {
        return this.f67159b.hashCode() + (this.f67158a.hashCode() * 31);
    }
}
