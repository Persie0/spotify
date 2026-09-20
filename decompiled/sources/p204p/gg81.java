package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gg81 {

    /* JADX INFO: renamed from: a */
    public final String f79572a;

    /* JADX INFO: renamed from: b */
    public final String f79573b;

    public gg81(String str, String str2) {
        this.f79572a = str;
        this.f79573b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg81)) {
            return false;
        }
        gg81 gg81Var = (gg81) obj;
        return wj50.m88271j(this.f79572a, gg81Var.f79572a) && wj50.m88271j(this.f79573b, gg81Var.f79573b);
    }

    public final int hashCode() {
        int iHashCode = this.f79572a.hashCode() * 31;
        String str = this.f79573b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
