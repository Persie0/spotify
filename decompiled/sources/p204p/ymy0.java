package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class ymy0 {

    /* JADX INFO: renamed from: e */
    public static final ymy0 f274351e = new ymy0(xmy0.f263468b, 0.0f, gly0.f81219d, new C1673an(1, 27, null));

    /* JADX INFO: renamed from: a */
    public final xmy0 f274352a;

    /* JADX INFO: renamed from: b */
    public final float f274353b;

    /* JADX INFO: renamed from: c */
    public final qe70 f274354c;

    /* JADX INFO: renamed from: d */
    public final mb61 f274355d;

    /* JADX WARN: Multi-variable type inference failed */
    public ymy0(xmy0 xmy0Var, float f, eh00 eh00Var, gh00 gh00Var) {
        this.f274352a = xmy0Var;
        this.f274353b = f;
        this.f274354c = (qe70) eh00Var;
        this.f274355d = (mb61) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymy0)) {
            return false;
        }
        ymy0 ymy0Var = (ymy0) obj;
        return this.f274352a == ymy0Var.f274352a && Float.compare(this.f274353b, ymy0Var.f274353b) == 0 && this.f274354c.equals(ymy0Var.f274354c) && this.f274355d.equals(ymy0Var.f274355d);
    }

    public final int hashCode() {
        return this.f274355d.hashCode() + ((this.f274354c.hashCode() + AbstractC0000a.m8g(this.f274352a.hashCode() * 31, 31, this.f274353b)) * 31);
    }
}
