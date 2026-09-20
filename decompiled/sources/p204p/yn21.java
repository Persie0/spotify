package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class yn21 implements zn21 {

    /* JADX INFO: renamed from: a */
    public final long f274379a;

    /* JADX INFO: renamed from: b */
    public final float f274380b;

    /* JADX INFO: renamed from: c */
    public final it91 f274381c;

    public yn21(long j, float f, it91 it91Var) {
        this.f274379a = j;
        this.f274380b = f;
        this.f274381c = it91Var;
    }

    @Override // p204p.zn21
    /* JADX INFO: renamed from: a */
    public final it91 mo88575a() {
        return this.f274381c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn21)) {
            return false;
        }
        yn21 yn21Var = (yn21) obj;
        return this.f274379a == yn21Var.f274379a && Float.compare(this.f274380b, yn21Var.f274380b) == 0 && wj50.m88271j(this.f274381c, yn21Var.f274381c);
    }

    public final int hashCode() {
        return this.f274381c.hashCode() + AbstractC0000a.m8g(Long.hashCode(this.f274379a) * 31, 31, this.f274380b);
    }
}
