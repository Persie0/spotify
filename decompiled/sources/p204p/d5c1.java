package p204p;

import java.util.Optional;

/* JADX INFO: loaded from: classes8.dex */
public final class d5c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f45392a;

    /* JADX INFO: renamed from: b */
    public final w4c1 f45393b;

    /* JADX INFO: renamed from: c */
    public final Optional f45394c;

    /* JADX INFO: renamed from: d */
    public final boolean f45395d;

    /* JADX INFO: renamed from: e */
    public final boolean f45396e;

    /* JADX INFO: renamed from: f */
    public final q5c1 f45397f;

    public d5c1(boolean z, w4c1 w4c1Var, Optional optional, boolean z2, boolean z3, q5c1 q5c1Var) {
        this.f45392a = z;
        this.f45393b = w4c1Var;
        this.f45394c = optional;
        this.f45395d = z2;
        this.f45396e = z3;
        this.f45397f = q5c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5c1)) {
            return false;
        }
        d5c1 d5c1Var = (d5c1) obj;
        return this.f45392a == d5c1Var.f45392a && wj50.m88271j(this.f45393b, d5c1Var.f45393b) && wj50.m88271j(this.f45394c, d5c1Var.f45394c) && this.f45395d == d5c1Var.f45395d && this.f45396e == d5c1Var.f45396e && wj50.m88271j(this.f45397f, d5c1Var.f45397f);
    }

    public final int hashCode() {
        return this.f45397f.hashCode() + s571.m77245d(s571.m77245d((this.f45394c.hashCode() + ((this.f45393b.hashCode() + (Boolean.hashCode(this.f45392a) * 31)) * 31)) * 31, 31, this.f45395d), 31, this.f45396e);
    }
}
