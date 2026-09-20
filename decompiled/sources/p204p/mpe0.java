package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mpe0 implements wpe0 {

    /* JADX INFO: renamed from: a */
    public final String f145995a;

    /* JADX INFO: renamed from: b */
    public final z650 f145996b;

    public mpe0(String str, z650 z650Var) {
        this.f145995a = str;
        this.f145996b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpe0)) {
            return false;
        }
        mpe0 mpe0Var = (mpe0) obj;
        return wj50.m88271j(this.f145995a, mpe0Var.f145995a) && wj50.m88271j(this.f145996b, mpe0Var.f145996b);
    }

    public final int hashCode() {
        int iHashCode = this.f145995a.hashCode() * 31;
        z650 z650Var = this.f145996b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
