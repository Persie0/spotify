package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sqd1 {

    /* JADX INFO: renamed from: a */
    public final int f213071a;

    /* JADX INFO: renamed from: b */
    public final boolean f213072b;

    public sqd1(int i, boolean z) {
        this.f213071a = i;
        this.f213072b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqd1)) {
            return false;
        }
        sqd1 sqd1Var = (sqd1) obj;
        return this.f213071a == sqd1Var.f213071a && this.f213072b == sqd1Var.f213072b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213072b) + (Integer.hashCode(this.f213071a) * 31);
    }
}
