package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v211 extends w211 {

    /* JADX INFO: renamed from: a */
    public final int f236520a;

    /* JADX INFO: renamed from: b */
    public final u511 f236521b;

    public v211(int i, u511 u511Var) {
        this.f236520a = i;
        this.f236521b = u511Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v211)) {
            return false;
        }
        v211 v211Var = (v211) obj;
        return this.f236520a == v211Var.f236520a && wj50.m88271j(this.f236521b, v211Var.f236521b);
    }

    public final int hashCode() {
        return this.f236521b.f226878a.hashCode() + (Integer.hashCode(this.f236520a) * 31);
    }
}
