package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yzw0 extends a0x0 {

    /* JADX INFO: renamed from: a */
    public final String f277911a;

    /* JADX INFO: renamed from: b */
    public final String f277912b;

    public yzw0(String str, String str2) {
        this.f277911a = str;
        this.f277912b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzw0)) {
            return false;
        }
        yzw0 yzw0Var = (yzw0) obj;
        return wj50.m88271j(this.f277911a, yzw0Var.f277911a) && wj50.m88271j(this.f277912b, yzw0Var.f277912b);
    }

    public final int hashCode() {
        int iHashCode = this.f277911a.hashCode() * 31;
        String str = this.f277912b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
