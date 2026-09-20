package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nt90 {

    /* JADX INFO: renamed from: a */
    public final String f158019a;

    /* JADX INFO: renamed from: b */
    public final String f158020b;

    public nt90(String str, String str2) {
        this.f158019a = str;
        this.f158020b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt90)) {
            return false;
        }
        nt90 nt90Var = (nt90) obj;
        return wj50.m88271j(this.f158019a, nt90Var.f158019a) && wj50.m88271j(this.f158020b, nt90Var.f158020b);
    }

    public final int hashCode() {
        int iHashCode = this.f158019a.hashCode() * 31;
        String str = this.f158020b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
