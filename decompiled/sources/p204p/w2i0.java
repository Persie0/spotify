package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w2i0 {

    /* JADX INFO: renamed from: a */
    public final String f247367a;

    /* JADX INFO: renamed from: b */
    public final String f247368b;

    public w2i0(String str, String str2) {
        this.f247367a = str;
        this.f247368b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2i0)) {
            return false;
        }
        w2i0 w2i0Var = (w2i0) obj;
        return wj50.m88271j(this.f247367a, w2i0Var.f247367a) && wj50.m88271j(this.f247368b, w2i0Var.f247368b);
    }

    public final int hashCode() {
        return this.f247368b.hashCode() + (this.f247367a.hashCode() * 31);
    }
}
