package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tzy {

    /* JADX INFO: renamed from: a */
    public final boolean f225321a;

    /* JADX INFO: renamed from: b */
    public final yif1 f225322b;

    public tzy(boolean z, yif1 yif1Var) {
        this.f225321a = z;
        this.f225322b = yif1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzy)) {
            return false;
        }
        tzy tzyVar = (tzy) obj;
        return this.f225321a == tzyVar.f225321a && wj50.m88271j(this.f225322b, tzyVar.f225322b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f225321a) * 31;
        yif1 yif1Var = this.f225322b;
        return iHashCode + (yif1Var == null ? 0 : yif1Var.hashCode());
    }
}
