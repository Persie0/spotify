package p204p;

import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public final class q680 extends v680 {

    /* JADX INFO: renamed from: a */
    public final boolean f185700a;

    /* JADX INFO: renamed from: b */
    public final boolean f185701b;

    /* JADX INFO: renamed from: c */
    public final Calendar f185702c;

    /* JADX INFO: renamed from: d */
    public final Calendar f185703d;

    public q680(boolean z, boolean z2, Calendar calendar, Calendar calendar2) {
        this.f185700a = z;
        this.f185701b = z2;
        this.f185702c = calendar;
        this.f185703d = calendar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q680)) {
            return false;
        }
        q680 q680Var = (q680) obj;
        return this.f185700a == q680Var.f185700a && this.f185701b == q680Var.f185701b && wj50.m88271j(this.f185702c, q680Var.f185702c) && wj50.m88271j(this.f185703d, q680Var.f185703d);
    }

    public final int hashCode() {
        int iHashCode = (this.f185702c.hashCode() + s571.m77245d(Boolean.hashCode(this.f185700a) * 31, 31, this.f185701b)) * 31;
        Calendar calendar = this.f185703d;
        return iHashCode + (calendar == null ? 0 : calendar.hashCode());
    }
}
