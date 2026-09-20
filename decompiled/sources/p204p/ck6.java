package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ck6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final String f38819a;

    /* JADX INFO: renamed from: b */
    public final kyy f38820b;

    public ck6(String str, kyy kyyVar) {
        this.f38819a = str;
        this.f38820b = kyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck6)) {
            return false;
        }
        ck6 ck6Var = (ck6) obj;
        return wj50.m88271j(this.f38819a, ck6Var.f38819a) && this.f38820b == ck6Var.f38820b;
    }

    public final int hashCode() {
        String str = this.f38819a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kyy kyyVar = this.f38820b;
        return iHashCode + (kyyVar != null ? kyyVar.hashCode() : 0);
    }
}
