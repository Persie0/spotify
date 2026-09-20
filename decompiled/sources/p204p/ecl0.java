package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ecl0 {

    /* JADX INFO: renamed from: a */
    public final String f58353a;

    /* JADX INFO: renamed from: b */
    public final String f58354b;

    public ecl0(String str, String str2) {
        this.f58353a = str;
        this.f58354b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecl0)) {
            return false;
        }
        ecl0 ecl0Var = (ecl0) obj;
        return wj50.m88271j(this.f58353a, ecl0Var.f58353a) && wj50.m88271j(this.f58354b, ecl0Var.f58354b);
    }

    public final int hashCode() {
        int iHashCode = this.f58353a.hashCode() * 31;
        String str = this.f58354b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
