package p204p;

/* JADX INFO: loaded from: classes11.dex */
@rtz0
public final class veb1 {
    public static final ueb1 Companion = new ueb1();

    /* JADX INFO: renamed from: a */
    public final seb1 f240666a;

    /* JADX INFO: renamed from: b */
    public final seb1 f240667b;

    public /* synthetic */ veb1(int i, seb1 seb1Var, seb1 seb1Var2) {
        if ((i & 1) == 0) {
            this.f240666a = null;
        } else {
            this.f240666a = seb1Var;
        }
        if ((i & 2) == 0) {
            this.f240667b = null;
        } else {
            this.f240667b = seb1Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veb1)) {
            return false;
        }
        veb1 veb1Var = (veb1) obj;
        return wj50.m88271j(this.f240666a, veb1Var.f240666a) && wj50.m88271j(this.f240667b, veb1Var.f240667b);
    }

    public final int hashCode() {
        seb1 seb1Var = this.f240666a;
        int iHashCode = (seb1Var == null ? 0 : seb1Var.hashCode()) * 31;
        seb1 seb1Var2 = this.f240667b;
        return iHashCode + (seb1Var2 != null ? seb1Var2.hashCode() : 0);
    }

    public veb1(seb1 seb1Var, seb1 seb1Var2) {
        this.f240666a = seb1Var;
        this.f240667b = seb1Var2;
    }
}
