package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hpb1 extends jpb1 {

    /* JADX INFO: renamed from: a */
    public final String f93737a;

    /* JADX INFO: renamed from: b */
    public final boolean f93738b;

    /* JADX INFO: renamed from: c */
    public final boolean f93739c;

    public hpb1(String str, boolean z, boolean z2) {
        this.f93737a = str;
        this.f93738b = z;
        this.f93739c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpb1)) {
            return false;
        }
        hpb1 hpb1Var = (hpb1) obj;
        return wj50.m88271j(this.f93737a, hpb1Var.f93737a) && this.f93738b == hpb1Var.f93738b && this.f93739c == hpb1Var.f93739c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93739c) + s571.m77245d(this.f93737a.hashCode() * 31, 31, this.f93738b);
    }
}
