package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class go70 {

    /* JADX INFO: renamed from: a */
    public final int f82900a;

    /* JADX INFO: renamed from: b */
    public final float f82901b;

    /* JADX INFO: renamed from: c */
    public final float f82902c;

    public go70(int i, float f, float f2) {
        this.f82900a = i;
        this.f82901b = f;
        this.f82902c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go70)) {
            return false;
        }
        go70 go70Var = (go70) obj;
        return this.f82900a == go70Var.f82900a && Float.compare(this.f82901b, go70Var.f82901b) == 0 && Float.compare(this.f82902c, go70Var.f82902c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f82902c) + AbstractC0000a.m8g(Integer.hashCode(this.f82900a) * 31, 31, this.f82901b);
    }
}
