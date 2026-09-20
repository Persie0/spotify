package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class f69 {

    /* JADX INFO: renamed from: a */
    public final float f66318a;

    /* JADX INFO: renamed from: b */
    public final float f66319b;

    /* JADX INFO: renamed from: c */
    public final int f66320c;

    /* JADX INFO: renamed from: d */
    public final float f66321d;

    /* JADX INFO: renamed from: e */
    public final float f66322e;

    public f69(float f, float f2, float f3, float f4, int i) {
        this.f66318a = f;
        this.f66319b = f2;
        this.f66320c = i;
        this.f66321d = f3;
        this.f66322e = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f69)) {
            return false;
        }
        f69 f69Var = (f69) obj;
        return Float.compare(this.f66318a, f69Var.f66318a) == 0 && Float.compare(this.f66319b, f69Var.f66319b) == 0 && this.f66320c == f69Var.f66320c && Float.compare(this.f66321d, f69Var.f66321d) == 0 && Float.compare(this.f66322e, f69Var.f66322e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66322e) + AbstractC0000a.m8g(mt60.m62800g(this.f66320c, AbstractC0000a.m8g(Float.hashCode(this.f66318a) * 31, 31, this.f66319b), 31), 31, this.f66321d);
    }
}
