package p204p;

import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: classes4.dex */
public final class jt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f115639a;

    /* JADX INFO: renamed from: b */
    public final boolean f115640b;

    /* JADX INFO: renamed from: c */
    public final boolean f115641c;

    /* JADX INFO: renamed from: d */
    public final int f115642d;

    /* JADX INFO: renamed from: e */
    public final Exception f115643e;

    public jt0(boolean z, boolean z2, boolean z3, int i, Exception exc) {
        this.f115639a = z;
        this.f115640b = z2;
        this.f115641c = z3;
        this.f115642d = i;
        this.f115643e = exc;
    }

    /* JADX INFO: renamed from: a */
    public static jt0 m54257a(jt0 jt0Var, boolean z, boolean z2, int i, BetamaxException betamaxException, int i2) {
        if ((i2 & 1) != 0) {
            z = jt0Var.f115639a;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 2) != 0 ? jt0Var.f115640b : false;
        if ((i2 & 4) != 0) {
            z2 = jt0Var.f115641c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            i = jt0Var.f115642d;
        }
        int i3 = i;
        Exception exc = betamaxException;
        if ((i2 & 16) != 0) {
            exc = jt0Var.f115643e;
        }
        return new jt0(z3, z4, z5, i3, exc);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54258b() {
        return (this.f115640b || this.f115642d == 0 || this.f115643e == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt0)) {
            return false;
        }
        jt0 jt0Var = (jt0) obj;
        return this.f115639a == jt0Var.f115639a && this.f115640b == jt0Var.f115640b && this.f115641c == jt0Var.f115641c && this.f115642d == jt0Var.f115642d && wj50.m88271j(this.f115643e, jt0Var.f115643e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f115639a) * 31, 31, this.f115640b), 31, this.f115641c);
        int i = this.f115642d;
        int iM38547C = (iM77245d + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        Exception exc = this.f115643e;
        return iM38547C + (exc != null ? exc.hashCode() : 0);
    }
}
