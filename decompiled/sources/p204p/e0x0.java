package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e0x0 {

    /* JADX INFO: renamed from: a */
    public final String f55058a;

    /* JADX INFO: renamed from: b */
    public final String f55059b;

    public e0x0(String str, String str2) {
        this.f55058a = str;
        this.f55059b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m37506a() {
        return this.f55059b;
    }

    /* JADX INFO: renamed from: b */
    public final String m37507b() {
        return this.f55058a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0x0)) {
            return false;
        }
        e0x0 e0x0Var = (e0x0) obj;
        return wj50.m88271j(this.f55058a, e0x0Var.f55058a) && wj50.m88271j(this.f55059b, e0x0Var.f55059b);
    }

    public final int hashCode() {
        int iHashCode = this.f55058a.hashCode() * 31;
        String str = this.f55059b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
