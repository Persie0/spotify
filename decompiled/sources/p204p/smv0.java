package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class smv0 {

    /* JADX INFO: renamed from: a */
    public final String f210732a;

    /* JADX INFO: renamed from: b */
    public final String f210733b;

    public smv0(String str, String str2) {
        this.f210732a = str;
        this.f210733b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smv0)) {
            return false;
        }
        smv0 smv0Var = (smv0) obj;
        return wj50.m88271j(this.f210732a, smv0Var.f210732a) && wj50.m88271j(this.f210733b, smv0Var.f210733b);
    }

    public final int hashCode() {
        int iHashCode = this.f210732a.hashCode() * 31;
        String str = this.f210733b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
