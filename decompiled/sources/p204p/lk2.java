package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class lk2 {

    /* JADX INFO: renamed from: a */
    public final float f134205a;

    /* JADX INFO: renamed from: b */
    public final float f134206b;

    /* JADX INFO: renamed from: c */
    public final float f134207c;

    /* JADX INFO: renamed from: d */
    public final float f134208d;

    /* JADX INFO: renamed from: e */
    public final long f134209e;

    public lk2(float f, float f2, float f3, float f4, long j) {
        this.f134205a = f;
        this.f134206b = f2;
        this.f134207c = f3;
        this.f134208d = f4;
        this.f134209e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk2)) {
            return false;
        }
        lk2 lk2Var = (lk2) obj;
        if (Float.compare(this.f134205a, lk2Var.f134205a) != 0 || Float.compare(this.f134206b, lk2Var.f134206b) != 0 || Float.compare(this.f134207c, lk2Var.f134207c) != 0 || Float.compare(this.f134208d, lk2Var.f134208d) != 0) {
            return false;
        }
        long j = lk2Var.f134209e;
        int i = n6f.f150872l;
        return as91.m27074b(this.f134209e, j);
    }

    public final int hashCode() {
        int iM8g = AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f134205a) * 31, 31, this.f134206b), 31, this.f134207c), 31, this.f134208d);
        int i = n6f.f150872l;
        return Long.hashCode(this.f134209e) + iM8g;
    }
}
