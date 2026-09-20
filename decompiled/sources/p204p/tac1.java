package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tac1 {

    /* JADX INFO: renamed from: a */
    public final String f218540a;

    /* JADX INFO: renamed from: b */
    public final boolean f218541b;

    /* JADX INFO: renamed from: c */
    public final int f218542c;

    public tac1(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        boolean z = (i & 2) != 0;
        int i2 = (i & 4) == 0 ? 2 : 1;
        this.f218540a = str;
        this.f218541b = z;
        this.f218542c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tac1)) {
            return false;
        }
        tac1 tac1Var = (tac1) obj;
        return wj50.m88271j(this.f218540a, tac1Var.f218540a) && this.f218541b == tac1Var.f218541b && this.f218542c == tac1Var.f218542c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f218542c) + s571.m77245d(this.f218540a.hashCode() * 31, 31, this.f218541b);
    }
}
