package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class od3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final List f164080j;

    /* JADX INFO: renamed from: k */
    public final boolean f164081k;

    /* JADX INFO: renamed from: l */
    public final ckf1 f164082l;

    public od3(List list, boolean z, ckf1 ckf1Var) {
        this.f164080j = list;
        this.f164081k = z;
        this.f164082l = ckf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return wj50.m88271j(this.f164080j, od3Var.f164080j) && this.f164081k == od3Var.f164081k && wj50.m88271j(this.f164082l, od3Var.f164082l);
    }

    public final int hashCode() {
        return this.f164082l.hashCode() + s571.m77245d(this.f164080j.hashCode() * 31, 31, this.f164081k);
    }
}
