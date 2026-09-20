package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ift extends s1h1 {

    /* JADX INFO: renamed from: b */
    public final String f101826b;

    /* JADX INFO: renamed from: c */
    public final d850 f101827c;

    public ift(String str, d850 d850Var) {
        this.f101826b = str;
        this.f101827c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ift)) {
            return false;
        }
        ift iftVar = (ift) obj;
        return wj50.m88271j(this.f101826b, iftVar.f101826b) && wj50.m88271j(this.f101827c, iftVar.f101827c);
    }

    public final int hashCode() {
        return this.f101827c.hashCode() + (this.f101826b.hashCode() * 31);
    }
}
