package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class thx0 implements aix0 {

    /* JADX INFO: renamed from: a */
    public final String f220512a;

    /* JADX INFO: renamed from: b */
    public final boolean f220513b;

    public thx0(String str, boolean z) {
        this.f220512a = str;
        this.f220513b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thx0)) {
            return false;
        }
        thx0 thx0Var = (thx0) obj;
        return wj50.m88271j(this.f220512a, thx0Var.f220512a) && this.f220513b == thx0Var.f220513b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220513b) + (this.f220512a.hashCode() * 31);
    }
}
