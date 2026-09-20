package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class il81 implements kl81 {

    /* JADX INFO: renamed from: a */
    public final String f103333a;

    /* JADX INFO: renamed from: b */
    public final String f103334b;

    public il81(String str, String str2) {
        this.f103333a = str;
        this.f103334b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il81)) {
            return false;
        }
        il81 il81Var = (il81) obj;
        return wj50.m88271j(this.f103333a, il81Var.f103333a) && wj50.m88271j(this.f103334b, il81Var.f103334b);
    }

    public final int hashCode() {
        int iHashCode = this.f103333a.hashCode() * 31;
        String str = this.f103334b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
