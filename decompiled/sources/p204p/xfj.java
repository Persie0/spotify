package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xfj {

    /* JADX INFO: renamed from: a */
    public final String f261027a;

    /* JADX INFO: renamed from: b */
    public final String f261028b;

    public xfj(String str, String str2) {
        this.f261027a = str;
        this.f261028b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfj)) {
            return false;
        }
        xfj xfjVar = (xfj) obj;
        return wj50.m88271j(this.f261027a, xfjVar.f261027a) && wj50.m88271j(this.f261028b, xfjVar.f261028b);
    }

    public final int hashCode() {
        return this.f261028b.hashCode() + (this.f261027a.hashCode() * 31);
    }
}
