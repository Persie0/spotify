package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iu81 {

    /* JADX INFO: renamed from: a */
    public final double f105885a;

    /* JADX INFO: renamed from: b */
    public final Integer f105886b;

    /* JADX INFO: renamed from: c */
    public final long f105887c;

    /* JADX INFO: renamed from: d */
    public final long f105888d;

    /* JADX INFO: renamed from: e */
    public final Object f105889e;

    public iu81(double d, Integer num, long j, long j2, List list) {
        this.f105885a = d;
        this.f105886b = num;
        this.f105887c = j;
        this.f105888d = j2;
        this.f105889e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu81)) {
            return false;
        }
        iu81 iu81Var = (iu81) obj;
        return Double.compare(this.f105885a, iu81Var.f105885a) == 0 && wj50.m88271j(this.f105886b, iu81Var.f105886b) && this.f105887c == iu81Var.f105887c && this.f105888d == iu81Var.f105888d && this.f105889e.equals(iu81Var.f105889e);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f105885a) * 31;
        Integer num = this.f105886b;
        return this.f105889e.hashCode() + dq60.m36605e(dq60.m36605e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.f105887c, 31), this.f105888d, 31);
    }
}
