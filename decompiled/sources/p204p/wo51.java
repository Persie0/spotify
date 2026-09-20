package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wo51 implements dp51 {

    /* JADX INFO: renamed from: a */
    public final boolean f253376a;

    /* JADX INFO: renamed from: b */
    public final ko51 f253377b;

    /* JADX INFO: renamed from: c */
    public final ko51 f253378c;

    /* JADX INFO: renamed from: d */
    public final String f253379d;

    public wo51(boolean z, ko51 ko51Var, ko51 ko51Var2, String str) {
        this.f253376a = z;
        this.f253377b = ko51Var;
        this.f253378c = ko51Var2;
        this.f253379d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo51)) {
            return false;
        }
        wo51 wo51Var = (wo51) obj;
        return this.f253376a == wo51Var.f253376a && wj50.m88271j(this.f253377b, wo51Var.f253377b) && wj50.m88271j(this.f253378c, wo51Var.f253378c) && wj50.m88271j(this.f253379d, wo51Var.f253379d);
    }

    public final int hashCode() {
        int iHashCode = (this.f253378c.hashCode() + ((this.f253377b.hashCode() + (Boolean.hashCode(this.f253376a) * 31)) * 31)) * 31;
        String str = this.f253379d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
