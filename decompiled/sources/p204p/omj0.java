package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class omj0 {

    /* JADX INFO: renamed from: a */
    public final String f167045a;

    /* JADX INFO: renamed from: b */
    public final String f167046b;

    public omj0(String str, String str2) {
        this.f167045a = str;
        this.f167046b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omj0)) {
            return false;
        }
        omj0 omj0Var = (omj0) obj;
        return wj50.m88271j(this.f167045a, omj0Var.f167045a) && wj50.m88271j(this.f167046b, omj0Var.f167046b);
    }

    public final int hashCode() {
        return this.f167046b.hashCode() + (this.f167045a.hashCode() * 31);
    }
}
