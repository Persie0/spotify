package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qy10 {

    /* JADX INFO: renamed from: a */
    public final String f193782a;

    /* JADX INFO: renamed from: b */
    public final String f193783b;

    public qy10(String str, String str2) {
        this.f193782a = str;
        this.f193783b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy10)) {
            return false;
        }
        qy10 qy10Var = (qy10) obj;
        return wj50.m88271j(this.f193782a, qy10Var.f193782a) && wj50.m88271j(this.f193783b, qy10Var.f193783b);
    }

    public final int hashCode() {
        int iHashCode = this.f193782a.hashCode() * 31;
        String str = this.f193783b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
