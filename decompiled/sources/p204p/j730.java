package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j730 {

    /* JADX INFO: renamed from: a */
    public final boolean f109477a;

    /* JADX INFO: renamed from: b */
    public final q5c1 f109478b;

    public j730(boolean z, q5c1 q5c1Var) {
        this.f109477a = z;
        this.f109478b = q5c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j730)) {
            return false;
        }
        j730 j730Var = (j730) obj;
        return this.f109477a == j730Var.f109477a && wj50.m88271j(this.f109478b, j730Var.f109478b);
    }

    public final int hashCode() {
        return this.f109478b.hashCode() + (Boolean.hashCode(this.f109477a) * 31);
    }
}
