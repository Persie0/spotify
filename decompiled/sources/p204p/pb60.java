package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pb60 {

    /* JADX INFO: renamed from: a */
    public final String f175723a;

    /* JADX INFO: renamed from: b */
    public final boolean f175724b;

    /* JADX INFO: renamed from: c */
    public final qb60 f175725c;

    public pb60(String str, boolean z, qb60 qb60Var) {
        this.f175723a = str;
        this.f175724b = z;
        this.f175725c = qb60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb60)) {
            return false;
        }
        pb60 pb60Var = (pb60) obj;
        return wj50.m88271j(this.f175723a, pb60Var.f175723a) && this.f175724b == pb60Var.f175724b && this.f175725c.equals(pb60Var.f175725c);
    }

    public final int hashCode() {
        return this.f175725c.hashCode() + s571.m77245d(this.f175723a.hashCode() * 31, 31, this.f175724b);
    }
}
