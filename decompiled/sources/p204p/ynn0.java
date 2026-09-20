package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ynn0 {

    /* JADX INFO: renamed from: a */
    public final String f274484a;

    /* JADX INFO: renamed from: b */
    public final int f274485b;

    public ynn0(String str, int i) {
        this.f274484a = str;
        this.f274485b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynn0)) {
            return false;
        }
        ynn0 ynn0Var = (ynn0) obj;
        return wj50.m88271j(this.f274484a, ynn0Var.f274484a) && this.f274485b == ynn0Var.f274485b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f274485b) + (this.f274484a.hashCode() * 31);
    }
}
