package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class liu0 {

    /* JADX INFO: renamed from: a */
    public final jiu0 f133898a;

    /* JADX INFO: renamed from: b */
    public final String f133899b;

    public liu0(jiu0 jiu0Var, String str) {
        this.f133898a = jiu0Var;
        this.f133899b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liu0)) {
            return false;
        }
        liu0 liu0Var = (liu0) obj;
        return wj50.m88271j(this.f133898a, liu0Var.f133898a) && wj50.m88271j(this.f133899b, liu0Var.f133899b);
    }

    public final int hashCode() {
        int iHashCode = this.f133898a.hashCode() * 31;
        String str = this.f133899b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
