package p204p;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class b2i0 {

    /* JADX INFO: renamed from: a */
    public long f22615a;

    /* JADX INFO: renamed from: b */
    public long f22616b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f22617c;

    /* JADX INFO: renamed from: d */
    public int f22618d;

    /* JADX INFO: renamed from: e */
    public int f22619e;

    /* JADX INFO: renamed from: a */
    public final TimeInterpolator m27958a() {
        TimeInterpolator timeInterpolator = this.f22617c;
        return timeInterpolator != null ? timeInterpolator : r05.f194384b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2i0)) {
            return false;
        }
        b2i0 b2i0Var = (b2i0) obj;
        if (this.f22615a == b2i0Var.f22615a && this.f22616b == b2i0Var.f22616b && this.f22618d == b2i0Var.f22618d && this.f22619e == b2i0Var.f22619e) {
            return m27958a().getClass().equals(b2i0Var.m27958a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22615a;
        long j2 = this.f22616b;
        return ((((m27958a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f22618d) * 31) + this.f22619e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(b2i0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f22615a);
        sb.append(" duration: ");
        sb.append(this.f22616b);
        sb.append(" interpolator: ");
        sb.append(m27958a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f22618d);
        sb.append(" repeatMode: ");
        return klh.m56832d(this.f22619e, "}\n", sb);
    }
}
