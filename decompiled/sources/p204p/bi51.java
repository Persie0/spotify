package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bi51 {

    /* JADX INFO: renamed from: a */
    public final String f27341a;

    /* JADX INFO: renamed from: b */
    public final String f27342b;

    public bi51(String str, String str2) {
        this.f27341a = str;
        this.f27342b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi51)) {
            return false;
        }
        bi51 bi51Var = (bi51) obj;
        return wj50.m88271j(this.f27341a, bi51Var.f27341a) && wj50.m88271j(this.f27342b, bi51Var.f27342b);
    }

    public final int hashCode() {
        return this.f27342b.hashCode() + (this.f27341a.hashCode() * 31);
    }
}
