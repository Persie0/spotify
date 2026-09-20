package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class v33 extends w33 {

    /* JADX INFO: renamed from: a */
    public final String f236756a;

    /* JADX INFO: renamed from: b */
    public final String f236757b;

    public v33(String str, String str2) {
        this.f236756a = str;
        this.f236757b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v33)) {
            return false;
        }
        v33 v33Var = (v33) obj;
        return wj50.m88271j(this.f236756a, v33Var.f236756a) && wj50.m88271j(this.f236757b, v33Var.f236757b);
    }

    public final int hashCode() {
        int iHashCode = this.f236756a.hashCode() * 31;
        String str = this.f236757b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
