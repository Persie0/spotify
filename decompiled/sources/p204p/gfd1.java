package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gfd1 {

    /* JADX INFO: renamed from: a */
    public final String f79340a;

    /* JADX INFO: renamed from: b */
    public final String f79341b;

    public gfd1(String str, String str2) {
        this.f79340a = str;
        this.f79341b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfd1)) {
            return false;
        }
        gfd1 gfd1Var = (gfd1) obj;
        return wj50.m88271j(this.f79340a, gfd1Var.f79340a) && wj50.m88271j(this.f79341b, gfd1Var.f79341b);
    }

    public final int hashCode() {
        return this.f79341b.hashCode() + (this.f79340a.hashCode() * 31);
    }
}
