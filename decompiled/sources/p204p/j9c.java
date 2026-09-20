package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j9c {

    /* JADX INFO: renamed from: a */
    public final c3e1 f110142a;

    /* JADX INFO: renamed from: b */
    public final int f110143b;

    public j9c(c3e1 c3e1Var, int i) {
        this.f110142a = c3e1Var;
        this.f110143b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9c)) {
            return false;
        }
        j9c j9cVar = (j9c) obj;
        return wj50.m88271j(this.f110142a, j9cVar.f110142a) && this.f110143b == j9cVar.f110143b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110143b) + (this.f110142a.hashCode() * 31);
    }
}
