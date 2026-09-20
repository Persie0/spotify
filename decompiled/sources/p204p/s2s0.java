package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class s2s0 {

    /* JADX INFO: renamed from: a */
    public final String f205064a;

    /* JADX INFO: renamed from: b */
    public final String f205065b;

    public s2s0(String str, String str2) {
        this.f205064a = str;
        this.f205065b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2s0)) {
            return false;
        }
        s2s0 s2s0Var = (s2s0) obj;
        return wj50.m88271j(this.f205064a, s2s0Var.f205064a) && wj50.m88271j(this.f205065b, s2s0Var.f205065b);
    }

    public final int hashCode() {
        int iHashCode = this.f205064a.hashCode() * 31;
        String str = this.f205065b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
