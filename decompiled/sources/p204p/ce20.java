package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ce20 implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f36998a;

    /* JADX INFO: renamed from: b */
    public final qf40 f36999b;

    public ce20(String str, AbstractC2524w8 abstractC2524w8) {
        this.f36998a = str;
        this.f36999b = abstractC2524w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce20)) {
            return false;
        }
        ce20 ce20Var = (ce20) obj;
        return wj50.m88271j(this.f36998a, ce20Var.f36998a) && wj50.m88271j(this.f36999b, ce20Var.f36999b);
    }

    public final int hashCode() {
        return this.f36999b.hashCode() + (this.f36998a.hashCode() * 31);
    }
}
